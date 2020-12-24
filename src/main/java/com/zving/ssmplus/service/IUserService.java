package com.zving.ssmplus.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.zving.ssmplus.entity.User;

/**
 * @Author JiangWei
 * @Email jiangwei@zving.com
 * @Date 2020/12/24
 * @Description
 */
public interface IUserService extends IService<User> {
	Long getMaxID();
}
