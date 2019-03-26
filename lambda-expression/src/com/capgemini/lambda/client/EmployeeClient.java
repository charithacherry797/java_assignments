package com.capgemini.lambda.client;

import java.util.Comparator;
import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String[] args) {
		/*
		 * Comparator<Employee> c = new Comparator<Employee>() {
		 * 
		 * @Override public int compare(Employee e1, Employee e2) { return
		 * Integer.compare(e1.getEmployeeId(), e2.getEmployeeId()); } };
		 */
		Comparator<Employee> c =(e1,e2)-> Integer.compare(e1.getEmployeeId(),e2.getEmployeeId());
		TreeSet<Employee> employee = new TreeSet<>(c);
		employee.add(new Employee(101, "alex", "hr", 34000));
		employee.add(new Employee(56, "grant", "admin", 12000));
		employee.add(new Employee(88, "bob", "admin", 56000));
		employee.add(new Employee(12, "taylor", "hr", 12000));
		for(Employee employee1:employee) {
			System.out.println(employee1);
		}
	}
}