package com.yyp.springbootrest.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.yyp.springbootrest.dto.VoucherDto;
import com.yyp.springbootrest.entity.base.Auditable;

/**
 * @author YYP
 * @since 22-OCT-2019
 */


@Entity
@Table(name = "voucher")
public class Voucher extends Auditable<String> implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private long userId;
	private Date date;
	private boolean am;
	private double totalAmount;
    @OneToMany(mappedBy = "voucher", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List <UserNumber> userNumberList;
	
	public Voucher() {
	}
	
	public Voucher(long id, long userId, Date date, boolean am, double totalAmount) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.am = am;
		this.totalAmount = totalAmount;
	}
	
	public Voucher(long id, long userId, Date date, boolean am, double totalAmount, List<UserNumber> userNumberList) {
		this.id = id;
		this.userId = userId;
		this.date = date;
		this.am = am;
		this.totalAmount = totalAmount;
		this.userNumberList = userNumberList;
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

	public List<UserNumber> getUserNumberList() {
		return userNumberList;
	}

	public void setUserNumberList(List<UserNumber> userNumberList) {
		this.userNumberList = userNumberList;
	}

}
