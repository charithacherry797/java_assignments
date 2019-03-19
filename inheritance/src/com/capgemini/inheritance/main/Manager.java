package com.capgemini.inheritance.main;

public class Manager extends Employee {
	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Manager(int employeeid, String employeename, double basicsalary, double medical) {
		super(employeeid, employeename, basicsalary, medical);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public double grossSalary() {
		petrolAllowance = getBasicsalary() * 0.08;
		foodAllowance = getBasicsalary() * 0.12;
		otherAllowance = getBasicsalary() * 0.03;
		
		
		return super.grossSalary() + petrolAllowance + foodAllowance + otherAllowance;
	}
	@Override
	public double netsalary() {
		
		
		return super.netsalary();
	}

}
