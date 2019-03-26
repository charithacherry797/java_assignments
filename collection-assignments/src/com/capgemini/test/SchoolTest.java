package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.main.School;


public class SchoolTest {
 private School rishi;
 private School nalanda;
 private School narayana;
 @Before
	public void setUp(){
	 rishi = new School("rishi","Kapada","Kadapa",1);
	 nalanda = new School("nalanda","pulivendula","YSR",3);
	 narayana = new School("narayana","nellore","Nellore",6);
	}
	@Test
	public void testSchoolAcceptingDuplicateValues() {
		ArrayList<School> school= new ArrayList<>();
		school.add(rishi);
		school.add(nalanda);
		school.add(narayana);
		school.add(rishi);
		
		Iterator<School> it=school.iterator();
			
		assertEquals(rishi,it.next());
		assertEquals(nalanda, it.next());
		assertEquals(narayana, it.next());
	}
	@Test
	public void testSchoolNotAcceptingDuplicateValues() {
		HashSet<School> school= new HashSet<>();
		school.add(rishi);
		school.add(nalanda);
		school.add(narayana);
		school.add(rishi);
		
		assertEquals(3, school.size());
	}
}
