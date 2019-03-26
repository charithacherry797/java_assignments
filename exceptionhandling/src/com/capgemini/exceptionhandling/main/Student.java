package com.capgemini.exceptionhandling.main;

import com.capgemini.expectionhandling.exceptions.AgeNotWithinRangeException;
import com.capgemini.expectionhandling.exceptions.NameNotWithinRangeException;

public class Student {
	private int rollno;
	private String name;
	private int age;
	private String course;
	private char ch;
	
    
	public Student() {
		super();
	}

	public Student(int rollno, String name, int age, String course) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.age = age;
		this.course = course;
		
		
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
public void testCheckAge() throws  AgeNotWithinRangeException {
	if (this.age <= 15 && this.age >= 21) {
		System.out.println("valid age");
	}
	else
	
		throw new AgeNotWithinRangeException("age is limit");
	}
	public void testName() throws NameNotWithinRangeException {
	if(!(name.matches("^[a-zA-Z]*$"))) 
	{
		throw new NameNotWithinRangeException("name in range");
	}	
	}

}
