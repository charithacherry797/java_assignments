package com.capgemini.main;

import java.util.Objects;

public class CellPhone {
private String company;
private String model;
private String descripition;
private String operatingSystem;
private double price;
public CellPhone() {
	super();
	// TODO Auto-generated constructor stub
}
public CellPhone(String company, String model, String descripition, String operatingSystem, double price) {
	super();
	this.company = company;
	this.model = model;
	this.descripition = descripition;
	this.operatingSystem = operatingSystem;
	this.price = price;
}
public String getCompany() {
	return company;
}
public void setCompany(String company) {
	this.company = company;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public String getDescripition() {
	return descripition;
}
public void setDescripition(String descripition) {
	this.descripition = descripition;
}
public String getOperatingSystem() {
	return operatingSystem;
}
public void setOperatingSystem(String operatingSystem) {
	this.operatingSystem = operatingSystem;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
@Override
public String toString() {
	return "CellPhone [company=" + company + ", model=" + model + ", descripition=" + descripition
			+ ", operatingSystem=" + operatingSystem + ", price=" + price + "]";
}
@Override
public int hashCode() {
	return Objects.hash(company,model,operatingSystem);
}
public boolean equals(Object obj) {
	if(obj==null)
		return false;
	if(!(obj instanceof CellPhone))
		return false;
	if(this==obj)
		return true;
	CellPhone cellPhone = (CellPhone) obj;
	if(this.company.equals(cellPhone.company) && this.model.equals(cellPhone.model) && this.operatingSystem.equals(cellPhone.operatingSystem))
		return true;
	else
		return false;
		
}
		
}
