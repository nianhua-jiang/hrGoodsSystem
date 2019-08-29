package com.jnh.hrGoodsSystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.jnh.hrGoodsSystem.bean.UserBean;
import com.jnh.hrGoodsSystem.mapper.UserMapper;
import com.jnh.hrGoodsSystem.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public UserBean login(String username, String password) {
		return userMapper.login(username, password);
	}

	@Override
	public boolean checkUserName(String username) {
		if (userMapper.checkUserName(username) == 1) {
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean insertUser(UserBean user) {
		if (userMapper.insertUser(user) == 1) {
			return true;
		} else {
			return false;
		}
	}

}
