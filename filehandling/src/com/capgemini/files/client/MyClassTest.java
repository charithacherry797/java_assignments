package com.capgemini.files.client;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.files.model.MyClass;

public class MyClassTest {

	ArrayList<MyClass> customer;
	MyClass c;
	@Before
	public void setUp()
	{
	    c =new MyClass(1, "chari", 22);
		MyClass c1 =new MyClass(2, "charitha", 21);
		MyClass c2 =new MyClass(3, "cherry", 26);
		MyClass c3=new MyClass(4, "raji", 21);
		MyClass c4 =new MyClass(5, "pranavi", 22);
		
		customer = new ArrayList<MyClass>();
		customer.add(c);
		customer.add(c1);
		customer.add(c2);
		customer.add(c3);
		customer.add(c4);
	}
	@Test
	public void testForSerialization() throws IOException 
	{
		MyClass c = new MyClass();
		assertTrue(c.serialization("Myclass.ser", customer));
		
	}
	
	@Test
	public void testForDeSerialization() throws IOException, ClassNotFoundException 
	{
		MyClass cl = new MyClass();
		ArrayList<MyClass> ar=(ArrayList<MyClass>) cl.deSerialization("Myclass.deser");
		
		Iterator iterator=ar.iterator();
		
		assertEquals(c, iterator.next());
		
	}


}
