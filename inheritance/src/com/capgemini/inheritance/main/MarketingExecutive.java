package com.capgemini.inheritance.main;

public class MarketingExecutive extends Employee {
	private double kilometersTravelled;
	private double tourAllowance;
	private static final double  telephoneAllowance = 1500;
	
	
	public MarketingExecutive() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public MarketingExecutive(int employeeId,String employeeName,double basicSalary,double medical,double kilometersTravelled) {
		super();
		this.kilometersTravelled = kilometersTravelled;
		
	}

	public double grossSalary() {
		tourAllowance=kilometersTravelled*5;
		return super.grossSalary()+telephoneAllowance+tourAllowance;
	}
	public double netSalary() {
		return super.netsalary();
	}
}


