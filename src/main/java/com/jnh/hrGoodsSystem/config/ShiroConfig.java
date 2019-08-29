package com.jnh.hrGoodsSystem.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Shiro配置类
 */
@Configuration
public class ShiroConfig {

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shirFilter(SecurityManager securityManager) {

		ShiroFilterFactoryBean bean = new ShiroFilterFactoryBean();
		// 设置 SecurityManager
		bean.setSecurityManager(securityManager);
		// 设置登录成功跳转Url
		bean.setSuccessUrl("/router/main");
		// 设置登录跳转Url
		bean.setLoginUrl("/router/login");
		// 设置未授权提示Url
		bean.setUnauthorizedUrl("/error/unAuth");
		Map<String, String> filterMap = new LinkedHashMap<String, String>();
		// authc:所有url都必须认证通过才可以访问; anon:所有url都都可以匿名访问
		filterMap.put("/user/login", "anon");
		filterMap.put("/user/isLogin", "anon");
		filterMap.put("/router/*", "anon");
		filterMap.put("/user/insertUser", "anon");
		filterMap.put("/user/checkUsername", "anon");
		//
		//filterMap.put("/goods", "anon");
		filterMap.put("/**", "authc");
		bean.setFilterChainDefinitionMap(filterMap);
		return bean;
	}

	@Bean
	public SecurityManager securityManager() {
		DefaultWebSecurityManager defaultSecurityManager = new DefaultWebSecurityManager();
		defaultSecurityManager.setRealm(ShiroRealm());
		return defaultSecurityManager;
	}

	@Bean
	public ShiroRealm ShiroRealm() {
		ShiroRealm shiroRealm = new ShiroRealm();
		return shiroRealm;
	}

}
