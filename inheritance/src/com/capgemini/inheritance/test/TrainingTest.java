package com.capgemini.inheritance.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.capgemini.inheritance.main.CorporateTraining;
import com.capgemini.inheritance.main.PublicTraining;
import com.capgemini.inheritance.main.Training;

class TrainingTest {

	@Test
	public void testPublicTrainingOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertEquals(250000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 45000, 4);
		assertEquals(180000, details.getOrderValue());
	}
	

	@Test
	public void testPublicTrainingFalseOrderValue() {
		Training details=new PublicTraining(101, "Java", 5000, 50);
		assertNotEquals(25000, details.getOrderValue());
	}
	@Test
	public void testCorporateTrainingFalseOrderValue() {
		Training details=new CorporateTraining(1001, "Big Data", 45000, 4);
		assertNotEquals(180000, details.getOrderValue());
	}
}
