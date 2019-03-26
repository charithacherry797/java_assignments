package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

import com.capgemini.exceptionhandling.exceptions.InvalidDayException;
import com.capgemini.exceptionhandling.exceptions.InvalidMonthException;
import com.capgemini.exceptionhandling.main.Date;

public class DateTest {
	@Test
	public void testtoCheckObjectIsUsingDefaultConstructor() {
		Date date = new Date();
		assertNotNull(date);
	}
	@Test
	public void testToCheckDayIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidDayException.class)
	public void testToCheckDayIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(32,12,1997);
	}
	
	@Test
	public void testToCheckMonthIsValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,12,1997);
	}
	
	@Test(expected=InvalidMonthException.class)
	public void testToCheckMonthIsNotValid() throws InvalidDayException, InvalidMonthException {
		Date date =new Date(25,14,1997);
	}

	

}
