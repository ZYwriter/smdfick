package com.fick.smd.hibernate.formbean.stockbean;

import java.util.Date;

// Generated 2013-3-13 15:10:01 by Hibernate Tools 4.0.0

/**
 * Stockstorage generated by hbm2java
 */
public class StockStorage implements java.io.Serializable {

	private Integer id;
	private String stockcode;
	private Float investment;
	private Float balance;
	private Integer dealnum;
	private Integer stocknum;
	private Integer lockedstocknum;
	private Integer todaystate;
	private Float buyprice;
	private Float sellprice;
	private Integer storagestate;
	private Float expectearning;
	private Date datetime;
	private Float earning;
	private Float amplituderate;
	private Float priceavgoffset;

	public StockStorage() {
		this.todaystate = 0;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStockcode() {
		return this.stockcode;
	}

	public void setStockcode(String stockcode) {
		this.stockcode = stockcode;
	}

	public Float getInvestment() {
		return this.investment;
	}

	public void setInvestment(Float investment) {
		this.investment = investment;
	}

	public Float getBalance() {
		return this.balance;
	}

	public void setBalance(Float balance) {
		this.balance = balance;
	}

	public Integer getDealnum() {
		return this.dealnum;
	}

	public void setDealnum(Integer dealnum) {
		this.dealnum = dealnum;
	}

	public Integer getStocknum() {
		return this.stocknum;
	}

	public void setStocknum(Integer stocknum) {
		this.stocknum = stocknum;
	}

	public Integer getLockedstocknum() {
		return this.lockedstocknum;
	}

	public void setLockedstocknum(Integer lockedstocknum) {
		this.lockedstocknum = lockedstocknum;
	}

	public Integer getTodaystate() {
		return this.todaystate;
	}

	public void setTodaystate(Integer todaystate) {
		this.todaystate = todaystate;
	}

	public Float getBuyprice() {
		return this.buyprice;
	}

	public void setBuyprice(Float buyprice) {
		this.buyprice = buyprice;
	}

	public Float getSellprice() {
		return this.sellprice;
	}

	public void setSellprice(Float sellprice) {
		this.sellprice = sellprice;
	}

	public Integer getStoragestate() {
		return this.storagestate;
	}

	public void setStoragestate(Integer storagestate) {
		this.storagestate = storagestate;
	}

	public Float getExpectearning() {
		return expectearning;
	}

	public void setExpectearning(Float expectearning) {
		this.expectearning = expectearning;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Float getEarning() {
		return earning;
	}

	public void setEarning(Float earning) {
		this.earning = earning;
	}

	public Float getAmplituderate() {
		return amplituderate;
	}

	public void setAmplituderate(Float amplituderate) {
		this.amplituderate = amplituderate;
	}

	public Float getPriceavgoffset() {
		return priceavgoffset;
	}

	public void setPriceavgoffset(Float priceavgoffset) {
		this.priceavgoffset = priceavgoffset;
	}

}
