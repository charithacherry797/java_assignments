package com.capgemini.inheritance.main;

public class Employee {
	private int employeeid;
	private String employeename;
	private double basicsalary;
	private double Hra;
	private double medical;
	private double pf;
	private double pt;
	private double netsalary;
	private double grossSalary;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeid, String employeename, double basicsalary,  double medical) {
		super();
		this.employeeid = employeeid;
		this.employeename = employeename;
		this.basicsalary = basicsalary;
		
		this.medical = medical;
	
		
		
		
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeename() {
		return employeename;
	}

	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}

	public double getBasicsalary() {
		return basicsalary;
	}
    public void setBasicSalary(double basicsalary) {
	this.basicsalary = basicsalary;
    }
	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double grossSalary() {
       Hra=0.50*basicsalary;
       grossSalary = basicsalary+medical+Hra;
      return grossSalary;
	}
	public double netsalary() {
		pf=0.12*basicsalary;
		pt=200;
		netsalary = grossSalary()-(pt+pf);
		return netsalary;
		
	}

}
