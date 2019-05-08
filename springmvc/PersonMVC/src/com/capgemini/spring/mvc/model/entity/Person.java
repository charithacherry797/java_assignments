package com.capgemini.spring.mvc.model.entity;

public class Person {

	private int persondId;
	private String personname;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int persondId, String personname) {
		super();
		this.persondId = persondId;
		this.personname = personname;
	}

	public int getPersondId() {
		return persondId;
	}

	public void setPersondId(int persondId) {
		this.persondId = persondId;
	}

	public String getPersonname() {
		return personname;
	}

	public void setPersonname(String personname) {
		this.personname = personname;
	}

}
