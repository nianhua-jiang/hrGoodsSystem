package com.jnh.hrGoodsSystem.bean;

public class GoodsBean {
	
	/**商品编号*/
	private String id;
	/**商品名称*/
	private String goodsName;
	/**商品数量*/
	private String goodsCount;
	/**单位*/
	private String goodsUnit;
	/**进货单价*/
	private String goodsBuyPrice;
	/**零售单价*/
	private String goodsSellPrice;
	
	private Integer userIdFlg;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the goodsName
	 */
	public String getGoodsName() {
		return goodsName;
	}
	/**
	 * @param goodsName the goodsName to set
	 */
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	/**
	 * @return the goodsCount
	 */
	public String getGoodsCount() {
		return goodsCount;
	}
	/**
	 * @param goodsCount the goodsCount to set
	 */
	public void setGoodsCount(String goodsCount) {
		this.goodsCount = goodsCount;
	}
	/**
	 * @return the goodsUnit
	 */
	public String getGoodsUnit() {
		return goodsUnit;
	}
	/**
	 * @param goodsUnit the goodsUnit to set
	 */
	public void setGoodsUnit(String goodsUnit) {
		this.goodsUnit = goodsUnit;
	}
	/**
	 * @return the goodsBuyPrice
	 */
	public String getGoodsBuyPrice() {
		return goodsBuyPrice;
	}
	/**
	 * @param goodsBuyPrice the goodsBuyPrice to set
	 */
	public void setGoodsBuyPrice(String goodsBuyPrice) {
		this.goodsBuyPrice = goodsBuyPrice;
	}
	/**
	 * @return the goodsSellPrice
	 */
	public String getGoodsSellPrice() {
		return goodsSellPrice;
	}
	/**
	 * @param goodsSellPrice the goodsSellPrice to set
	 */
	public void setGoodsSellPrice(String goodsSellPrice) {
		this.goodsSellPrice = goodsSellPrice;
	}
	/**
	 * @return the userIdFlg
	 */
	public Integer getUserIdFlg() {
		return userIdFlg;
	}
	/**
	 * @param userIdFlg the userIdFlg to set
	 */
	public void setUserIdFlg(Integer userIdFlg) {
		this.userIdFlg = userIdFlg;
	}
	
	
}
