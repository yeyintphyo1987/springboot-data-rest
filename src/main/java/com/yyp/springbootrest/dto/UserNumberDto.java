package com.yyp.springbootrest.dto;

import com.yyp.springbootrest.entity.UserNumber;

/**
 * @author YYP
 * @since 22-OCT-2019
 */

public class UserNumberDto {
 
	private long id;
	private int number;
	private double numberAmount;
	
	public UserNumberDto() {
	}

	public UserNumberDto(long id, int number, double numberAmount) {
		this.id = id;
		this.number = number;
		this.numberAmount = numberAmount;
	}

	public UserNumberDto(UserNumber userNumber) {
		this.id = userNumber.getId();
		this.number = userNumber.getNumber();
		this.numberAmount = userNumber.getNumberAmount();

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

}
