package com.jnh.hrGoodsSystem.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnh.hrGoodsSystem.bean.UserBean;
import com.jnh.hrGoodsSystem.common.Common;
import com.jnh.hrGoodsSystem.service.UserService;

@RestController
@RequestMapping("/user")
@ResponseBody
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping("/login")
	public String login(String username, String password) {

		String msg = Common.EMPTY;

		if (checkUsername(username)) {
			UserBean userBean = userService.login(username, password);
			if (userBean != null) {
				Subject subject = SecurityUtils.getSubject();
				Session session = subject.getSession();
				session.setAttribute("username", userBean.getUserName());
				session.setAttribute("userId", userBean.getUserId());

				UsernamePasswordToken token = new UsernamePasswordToken(username, password);
				subject.login(token);
			} else {
				msg = "密码错误";
			}
		} else {
			msg = "用户名不存在";
		}
		return msg;
	}

	/**
	 * 验证登录
	 */
	@RequestMapping("/isLogin")
	public boolean isLogin() {
		Subject subject = SecurityUtils.getSubject();
		boolean bool = subject.isAuthenticated();
		return bool;
	}

	/**
	 * 退出登录
	 */
	@RequestMapping("/logOut")
	public boolean logOut() {
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		return true;
	}

	@RequestMapping("/checkUsername")
	public boolean checkUsername(String checkUsername) {
		boolean bool = userService.checkUserName(checkUsername);
		return bool;
	}

	@RequestMapping("/insertUser")
	// @RequiresRoles("顾客") 设置访问角色
	public boolean insertUser(UserBean user) {
		boolean bool = false;
		if (!checkUsername(user.getUserName())) {
			bool = userService.insertUser(user);
		}
		return bool;
	}
}
