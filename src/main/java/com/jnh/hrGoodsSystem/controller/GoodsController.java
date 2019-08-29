package com.jnh.hrGoodsSystem.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jnh.hrGoodsSystem.bean.GoodsBean;
import com.jnh.hrGoodsSystem.service.GoodsService;

@RestController
@RequestMapping("/goods")
@ResponseBody
public class GoodsController {

	@Autowired
	GoodsService goodsservice;

	private Integer getUserId() {
		Subject subject = SecurityUtils.getSubject();
		Session session = subject.getSession();
		Integer userId = (Integer) session.getAttribute("userId");
		return userId;
	}
	
	@RequestMapping("/searchAllGoods")
	public List<GoodsBean> searchAllGoods(int page) {
		
		// 每页开始的下标
		Integer from = (page - 1) * 11;
		// 每页的条数
		Integer to = 11;

		return goodsservice.searchAllGoods(getUserId(), from, to);
	}

	@RequestMapping("/searchCount")
	public int searchCount() {
		return goodsservice.searchCount(getUserId());
	}
	
	@RequestMapping("/insertGoods")
	public int insertGoods(GoodsBean goods){
		goods.setUserIdFlg(getUserId());
		return goodsservice.insertGoods(goods);
	}
	
}
