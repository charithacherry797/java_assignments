package com.capgemini.inheritance.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.Manager;

class ManagerTest {

Manager manager;
	
	@BeforeEach
	public void setUp() {
		 manager = new Manager(101,"cherry",35000,5000);
		
	}

	
		
	
	@Test
	public void testManagerCalculateGrossSalary() {
		assertEquals(65550,manager.grossSalary(),0.01);
	}
    @Test
    public void testManagerCalculateNetSalary() {
    	assertEquals(65550,manager.grossSalary(),0.01);
    }

}
