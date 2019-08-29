package com.jnh.hrGoodsSystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.jnh.hrGoodsSystem.bean.GoodsBean;

@Mapper
public interface GoodsMapper {
	
	public List<GoodsBean> searchAllGoods(@Param("userIdFlg") Integer userIdFlg,@Param("from") Integer from, @Param("to") Integer to);
	
	public int searchCount(Integer userIdflg);
	
	public int insertGoods(GoodsBean goods);
}
