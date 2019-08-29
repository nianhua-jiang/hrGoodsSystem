package com.jnh.hrGoodsSystem.service;

import com.jnh.hrGoodsSystem.bean.UserBean;

public interface UserService {

	public UserBean login(String username, String password);

	public boolean checkUserName(String username);
	
	public boolean insertUser(UserBean user);
}
