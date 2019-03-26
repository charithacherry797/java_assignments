package com.capgemini.main;

import java.util.Objects;

public class Student implements Comparable<Student>{
	private int rollno;
	private String name;
	private String fruit;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String name, String fruit) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.fruit = fruit;
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

	public String getFruit() {
		return fruit;
	}

	public void setFruit(String fruit) {
		this.fruit = fruit;
	}

	@Override
	public int hashCode() {
		return Objects.hash(rollno,name);
	}

	@Override
	public boolean equals(Object obj) {
		if(obj==null)
			return false;
		if(!(obj instanceof Student))
			return false;
		if(this==obj)
			return true;
		Student student = (Student) obj;
		if(this.rollno==student.rollno && this.name.equals(student.name))
			return true;
		else
			return false;
			
	}
	public int compareTo(Student student) {
		return this.name.compareTo(student.name);
	}

}
