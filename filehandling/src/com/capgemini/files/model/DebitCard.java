package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard implements Serializable{
private long cardNumber;
private int cvv;
private int expiryMonth;
private int expireYear;
public DebitCard() {
	super();
	// TODO Auto-generated constructor stub
}
public DebitCard(long cardNumber, int cvv, int expiryMonth, int expireYear) {
	super();
	this.cardNumber = cardNumber;
	this.cvv = cvv;
	this.expiryMonth = expiryMonth;
	this.expireYear = expireYear;
}
public long getCardNumber() {
	return cardNumber;
}
public void setCardNumber(long cardNumber) {
	this.cardNumber = cardNumber;
}
public int getCvv() {
	return cvv;
}
public void setCvv(int cvv) {
	this.cvv = cvv;
}
public int getExpiryMonth() {
	return expiryMonth;
}
public void setExpiryMonth(int expiryMonth) {
	this.expiryMonth = expiryMonth;
}
public int getExpireYear() {
	return expireYear;
}
public void setExpireYear(int expireYear) {
	this.expireYear = expireYear;
}

}
