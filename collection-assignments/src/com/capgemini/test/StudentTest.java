package com.capgemini.test;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Student;

public class StudentTest {
private Student cherry;
private Student charitha;
private Student john;
@Before
public void setUp(){
	cherry = new Student(101,"cherry","Mango");
	charitha = new Student(102,"charitha","Orange");
	john = new Student(103,"john","Apple");
}
@Test
public void testStudentAcceptingDuplicateValues() {
	ArrayList<Student> student= new ArrayList<>();
	student.add(cherry);
	student.add(charitha);
	student.add(john);
	student.add(cherry);
	
	Iterator<Student> it=student.iterator();
		
	assertEquals(cherry,it.next());
	assertEquals(charitha, it.next());
	assertEquals(john, it.next());
}
@Test
public void testStudentNotAcceptingDuplicateValues() {
	TreeSet<Student> student= new TreeSet<>();
	student.add(cherry);
	student.add(charitha);
	student.add(john);
	student.add(cherry);
	assertEquals(3, student.size());
	
	}
	

@Test
public void testDisplayStudentFavoriteFruitByGivingStudentName() {
	Map<String ,String> fruit=new HashMap<String, String>();
	fruit.put("cherry","Mango");
	fruit.put("charitha", "Orange");
	fruit.put("john","Apple");

	Collection<String > keys=fruit.keySet();
	assertEquals(3, keys.size());
	
	Collection<String> values=fruit.values();
	assertEquals(3, values.size());
	
	assertEquals(cherry.getFruit(),fruit.get("cherry"));
	assertEquals(charitha.getFruit(), fruit.get("charitha"));
	assertEquals(john.getFruit(), fruit.get("john"));
	
		
	
}

}
