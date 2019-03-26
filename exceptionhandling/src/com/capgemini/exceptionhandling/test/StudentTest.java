package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.exceptionhandling.main.Student;
import com.capgemini.expectionhandling.exceptions.AgeNotWithinRangeException;
import com.capgemini.expectionhandling.exceptions.NameNotWithinRangeException;

 public class StudentTest {

	Student student;

	@Before
	public void setUp() {
		student = new Student(41, "cherry", 21, "java");

	}

	@Test
	public void testEmployeeObjectIsCreatedwithParameterizedConstructor() {
	Student student = new Student(41,"cherry",21,"java");
		assertNotNull(student);
		assertEquals(41,student.getRollno());
		assertEquals("cherry",student.getName());
		assertEquals(21,student.getAge());
		assertEquals("java",student.getCourse());
		
	}

	@Test(expected = AgeNotWithinRangeException.class)
	public void testCheckage() throws AgeNotWithinRangeException {
		student.testCheckAge();
	}
	@Test(expected= NameNotWithinRangeException.class)
	public void testName() throws NameNotWithinRangeException {
		Student student = new Student(41,"cher216345ry",21,"java");
		student.testName();
	}
	}

