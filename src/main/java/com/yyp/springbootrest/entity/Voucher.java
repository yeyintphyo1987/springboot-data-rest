package com.yyp.springbootrest.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import com.yyp.springbootrest.dto.VoucherDto;

/**
 * @author YYP
 * @since 22-OCT-2019
 */


@Entity
public class Voucher {
 
    @Id
    @GeneratedValue
	private long id;
	private long userId;
	private Date date;
	private boolean am;
	private double totalAmount;
	
	public Voucher() {
	}
	
	public Voucher(long id, long userId, Date date, boolean am, double totalAmount) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.am = am;
		this.totalAmount = totalAmount;
	}
	
	public Voucher(VoucherDto dto) {
		this.id = dto.getId();
		this.userId = dto.getUserId();
		this.date = dto.getDate();
		this.am = dto.isAm();
		this.totalAmount = dto.getTotalAmount();
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
