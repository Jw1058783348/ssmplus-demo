package com.zving.ssmplus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.zving.ssmplus.entity.User;
import com.zving.ssmplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.*;

/**
 * @Author JiangWei
 * @Email jiangwei@zving.com
 * @Date 2020/11/19
 * @Description
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
	@Autowired
	public IUserService userService;

	@GetMapping()
	@ResponseBody
	public String hello(){
		return "hello world";
	}

	@GetMapping("/list")
	@ResponseBody
	public String list(){
		return userService.list().toString();
	}

	@PostMapping()
	@ResponseBody
	public String add(User user){
		Long maxID = userService.getMaxID();
		if(ObjectUtils.isEmpty(maxID)){
			maxID = 1L;
		}
		user.setID(maxID+1);
		boolean b = userService.saveOrUpdate(user);
		return b?"success":"fail";
	}

	@PutMapping("/{ID}")
	@ResponseBody
	public String update(@PathVariable("ID") Long ID,User user){
		user.setID(ID);
		boolean b = userService.saveOrUpdate(user);
		return b?"success":"fail";
	}

	@DeleteMapping("/{ID}")
	@ResponseBody
	public String delete(@PathVariable Long ID){
		boolean b = userService.removeById(ID);
		return b?"success":"fail";
	}
}
