package com.jnh.hrGoodsSystem.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jnh.hrGoodsSystem.bean.UserBean;

@Mapper
public interface UserMapper {

	public UserBean login(@Param("username") String username, @Param("password") String password);

	public int checkUserName(String username);

	public int insertUser(UserBean user);
}
