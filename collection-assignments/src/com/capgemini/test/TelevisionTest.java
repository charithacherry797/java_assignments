package com.capgemini.test;



import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;


import com.capgemini.main.Television;

public class TelevisionTest {

	private Television lgTv;
	private Television samsungTv;
	private Television sonyTv;
	@Before
	public void setUp(){
		lgTv = new Television("lgTv","LED","NO",30000);
		samsungTv = new Television("samsung","LCD","yes",45000);
		sonyTv = new Television("sony","PLASMA","yes",55000);
	}
	@Test
	public void testTelevisionAcceptingDuplicateValues() {
		ArrayList<Television> television= new ArrayList<>();
		television.add(lgTv);
		television.add(samsungTv);
		television.add(sonyTv);
		television.add(lgTv);
		
		Iterator<Television> it=television.iterator();
			
		assertEquals(lgTv,it.next());
		assertEquals(samsungTv, it.next());
		assertEquals(sonyTv, it.next());
	}
	@Test
	public void testTelevisionNotAcceptingDuplicateValues() {
		HashSet<Television> television= new HashSet<>();
		television.add(lgTv);
		television.add(samsungTv);
		television.add(sonyTv);
		television.add(lgTv);
		
		assertEquals(3, television.size());
	}
}
