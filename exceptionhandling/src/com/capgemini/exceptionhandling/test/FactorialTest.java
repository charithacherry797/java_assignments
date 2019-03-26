package com.capgemini.exceptionhandling.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.main.Factorial;
import com.capgemini.expectionhandling.exceptions.FactorialException;
import com.capgemini.expectionhandling.exceptions.InvalidInputException;

public class FactorialTest {
    @Test (expected=InvalidInputException.class)
    public void testFactorialOfNumberLessthanTwo() throws InvalidInputException,FactorialException {
    	Factorial fact= new Factorial();
    	fact.getFactorial(0);
    }
    @Test(expected=FactorialException.class)
    public void testFactorialOfGivenNumberExceedsRange() throws InvalidInputException,FactorialException {
    	Factorial fact= new Factorial();
    	fact.getFactorial(15);
    }
    @Test 
    public void testFactorialOfValidNumber() {
    	Factorial fact= new Factorial();
    	try {
    		assertEquals(120,fact.getFactorial(5));
    	}
    	catch(FactorialException | InvalidInputException e) {
    		e.printStackTrace();
    	}
    	}
    }


