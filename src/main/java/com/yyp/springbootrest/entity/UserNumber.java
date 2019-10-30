package com.yyp.springbootrest.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.yyp.springbootrest.dto.UserNumberDto;
import com.yyp.springbootrest.entity.base.Auditable;

/**
 * @author YYP
 * @since 22-OCT-2019
 */


@Entity
@Table(name = "user_number")
public class UserNumber extends Auditable<String> implements Serializable {
 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private int number;
	private double numberAmount;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "voucher_id", nullable = false)
    @JsonBackReference
    private Voucher voucher;
	
	public UserNumber() {
	}
	
	public UserNumber(long id, long boucherId, int number, double numberAmount, Voucher voucher) {
		this.id = id;
		this.number = number;
		this.numberAmount = numberAmount;
		this.voucher = voucher;
	}
	
	public UserNumber(UserNumberDto dto) {
		this.id = dto.getId();
		this.number = dto.getNumber();
		this.numberAmount = dto.getNumberAmount();
	}	

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getNumberAmount() {
		return numberAmount;
	}

	public void setNumberAmount(double numberAmount) {
		this.numberAmount = numberAmount;
	}

	public Voucher getVoucher() {
		return voucher;
	}

	public void setVoucher(Voucher voucher) {
		this.voucher = voucher;
	}

}
