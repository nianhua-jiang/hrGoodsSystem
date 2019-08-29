package com.jnh.hrGoodsSystem.service;

import java.util.List;

import com.jnh.hrGoodsSystem.bean.GoodsBean;

public interface GoodsService {

	public List<GoodsBean> searchAllGoods(Integer userIdFlg,Integer from,Integer to);
	
	public int searchCount(Integer userIdFlg);
	
	public int insertGoods(GoodsBean goods);
	
}
