package com.yyp.springbootrest.dto;

import java.util.Date;

import com.yyp.springbootrest.entity.Voucher;

/**
 * @author YYP
 * @since 22-OCT-2019
 */

public class VoucherDto {
 
	private long id;
	private long userId;
	private Date date;
	private boolean am;
	private double totalAmount;
	
	public VoucherDto() {
	}

	public VoucherDto(long id, long userId, Date date, boolean am, double totalAmount) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.am = am;
		this.totalAmount = totalAmount;
	}
	
	public VoucherDto(Voucher voucher) {
		this.id = voucher.getId();
		this.userId = voucher.getUserId();
		this.date = voucher.getDate();
		this.am = voucher.isAm();
		this.totalAmount = voucher.getTotalAmount();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isAm() {
		return am;
	}

	public void setAm(boolean am) {
		this.am = am;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	
}
