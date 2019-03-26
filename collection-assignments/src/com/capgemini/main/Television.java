package com.capgemini.main;

import java.util.Objects;

public class Television {
private String company;
private String type;
private String enabled;
private double price;
public Television() {
	super();
	// TODO Auto-generated constructor stub
}
public Television(String company, String type, String enabled, double price) {
	super();
	this.company = company;
	this.type = type;
	this.enabled = enabled;
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String getEnabled() {
	return enabled;
}
public void setEnabled(String enabled) {
	this.enabled = enabled;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public int hashCode() {
	return Objects.hash(company,type,price);
}
@Override
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(!(obj instanceof Television))
		return false;
	if(this==obj)
		return true;
	Television television = (Television) obj;
	if(this.company.equals(television.company) && this.type.equals(television.type) && this.price ==television.price)
		return true;
	else
		return false;
}
		
@Override
public String toString() {
	return "Television [company=" + company + ", type=" + type + ", enabled=" + enabled + ", price=" + price + "]";
}

}
