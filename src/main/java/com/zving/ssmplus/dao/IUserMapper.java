package com.zving.ssmplus.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.zving.ssmplus.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Author JiangWei
 * @Email jiangwei@zving.com
 * @Date 2020/12/24
 * @Description
 */
@Mapper
public interface IUserMapper extends BaseMapper<User> {
	Long getMaxID();

}
