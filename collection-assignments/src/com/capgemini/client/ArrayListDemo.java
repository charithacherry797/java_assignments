package com.capgemini.client;

import java.util.ArrayList;
import java.util.Iterator;

import org.junit.jupiter.api.Test;`

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
		names.add("Alex");
		names.add("Anna");
		names.add("Adam");
		names.add("Bob");
		names.add("Grant");
		// names.add(10);
         
		/*
		 * Iterator<String> it = names.iterator(); while (it.hasNext()) { String name =
		 * it.next(); System.out.println(name); }
		 */
		for(String name:names)
		{
			System.out.println(name);
			}
		}
}