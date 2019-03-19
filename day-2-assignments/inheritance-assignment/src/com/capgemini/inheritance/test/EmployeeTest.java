package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import com.capgemini.inheritance.main.Employee;

public class EmployeeTest {
	Employee employee;
	@BeforeEach
    public void setUp() {
    	 employee = new Employee(101,"mouni",35000,5000);
    	
    }
	@Test
	public void testEmployeeObjectIsCreatedwithDefaultConstructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}
	@Test
	public void testEmployeeObjectIsCreatedwithParameterizedConstructor() {
		Employee employee = new Employee(101,"mouni",35000,5000);
		assertNotNull(employee);
		assertEquals(101,employee.getEmployeeid());
		assertEquals("mouni",employee.getEmployeename());
		assertEquals(35000,employee.);
		assertEquals(5000,employee.getMedical(),0.01);
		
	}
	@Test
	public void testCalculateForGrossSalary() {
		assertEquals(57500,employee.grossSalary(),0.01);
	}
	@Test
	public void testCalculateForNetSalarty() {
		assertEquals(53100,employee.netsalary(),0.01);
		
	}
	 
}
