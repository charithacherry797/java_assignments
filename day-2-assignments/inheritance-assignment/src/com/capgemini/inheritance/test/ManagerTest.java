package com.capgemini.inheritance.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import com.capgemini.inheritance.main.Manager;



public class ManagerTest {
	Manager manager;
	
	@BeforeEach
	public void setUp() {
		 manager = new Manager(101,"naina",35000,5000);
		
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
