package com.capgemini.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.main.Car;




public class CarTest {
private static Car bmwCar;
private static Car nanoCar;
private static Car audiCar;
@Before
public void setUp(){
	bmwCar = new Car("India","BMWX1",2017,500000);
	nanoCar = new Car("China","10HNano",2016,100000);
	audiCar = new Car("NewYork","AudiQ3",2014,300000);
}
@Test
public void testCarAcceptingDuplicateValues() {
	ArrayList<Car> car= new ArrayList<>();
	car.add(bmwCar);
	car.add(nanoCar);
	car.add(audiCar);
	car.add(bmwCar);
	
	Iterator<Car> it = car.iterator();

	assertEquals(bmwCar, it.next());
	assertEquals(nanoCar, it.next());
	assertEquals(audiCar, it.next());
}

@Test
public void testCarNotAcceptingDuplicateValues() {
	HashSet<Car> car = new HashSet<>();
	car.add(bmwCar);
	car.add(nanoCar);
	car.add(audiCar);

	assertEquals(3, car.size());

}
@Test
public void testCarSortedBasedOnMake() {
	TreeSet<Car> car = new TreeSet<>();
	car.add(bmwCar);
	car.add(nanoCar);
	car.add(audiCar);
	Iterator<Car> it = car.iterator();
	assertEquals(nanoCar, it.next());
	assertEquals(bmwCar, it.next());
	
	assertEquals(audiCar, it.next());
	
	
	
}

}
