package com.zving.ssmplus.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.zving.ssmplus.dao.IUserMapper;
import com.zving.ssmplus.entity.User;
import com.zving.ssmplus.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author JiangWei
 * @Email jiangwei@zving.com
 * @Date 2020/12/24
 * @Description
 */
@Service("userService")
public class UserService extends ServiceImpl<IUserMapper, User> implements IUserService {

	@Autowired
	public IUserMapper userMapper;

	@Override
	public Long getMaxID() {
		return userMapper.getMaxID();
	}
}
