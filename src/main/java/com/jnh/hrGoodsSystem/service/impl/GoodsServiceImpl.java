package com.jnh.hrGoodsSystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jnh.hrGoodsSystem.bean.GoodsBean;
import com.jnh.hrGoodsSystem.mapper.GoodsMapper;
import com.jnh.hrGoodsSystem.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	@Autowired
	GoodsMapper goodsMapper;

	@Override
	public List<GoodsBean> searchAllGoods(Integer userIdFlg, Integer from, Integer to) {
		return goodsMapper.searchAllGoods(userIdFlg, from, to);
	}

	public int searchCount(Integer userIdFlg) {
		return goodsMapper.searchCount(userIdFlg);
	}

	public int insertGoods(GoodsBean goods){
		return goodsMapper.insertGoods(goods);
	}
	
}
