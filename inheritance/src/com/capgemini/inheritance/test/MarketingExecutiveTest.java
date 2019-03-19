package com.capgemini.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.MarketingExecutive;

class MarketingExecutiveTest {

MarketingExecutive employee;
	
	@BeforeEach
	public void setUp() {
		employee = new MarketingExecutive(101, "cherry", 35000, 5000, 30);
		
	}
	@Test
	public void testGrossSalaryOfMarketingExecutive() {
		assertEquals(1650,employee.grossSalary(),0.01);
	}
	@Test
	public void testNetSalaryOfMarketingExecutive1() {
		assertEquals(1450,employee.netSalary(),0.01);
	}
}
