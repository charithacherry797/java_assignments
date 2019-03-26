package com.capgemini.test;

import static org.junit.Assert.assertEquals;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.CellPhone;


public class CellPhoneTest {
	private CellPhone mi;
	public CellPhone iphone;
	public CellPhone onePlus;
	@Before
	public void setUp(){
		mi = new CellPhone("mi","miNote5","chargingGood","Android",13000);
		iphone = new CellPhone("iphone","iphone6s","photos","ios",40000);
		onePlus = new CellPhone("onePlus","onePlus1","photos","Android",30000);
	}
	@Test
	public void testCellPhoneAcceptingDuplicateValues() {
		ArrayList<CellPhone> cellPhone= new ArrayList<>();
		cellPhone.add(mi);
		cellPhone.add(iphone);
		cellPhone.add(onePlus);
		cellPhone.add(mi);
		
		Iterator<CellPhone> it=cellPhone.iterator();
			
		assertEquals(mi,it.next());
		assertEquals(iphone, it.next());
		assertEquals(onePlus, it.next());
	}
	@Test
	public void testCellPhoneNotAcceptingDuplicateValues() {
		HashSet<CellPhone> cellPhone= new HashSet<>();
		cellPhone.add(mi);
		cellPhone.add(iphone);
		cellPhone.add(onePlus);
		cellPhone.add(mi);
		
		assertEquals(3, cellPhone.size());
	}
}
