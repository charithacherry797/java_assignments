package com.capgemini.exceptionhandling.main;

import com.capgemini.exceptionhandling.exceptions.InvalidDayException;
import com.capgemini.exceptionhandling.exceptions.InvalidMonthException;

public class Date {
	private int day;
	private int month;
	private int year;

	public Date() {
		super();

	}

	public Date(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
		super();
		if (day <= 31)

			this.day = day;
		else
			throw new InvalidDayException("Day is not valid");
		if (month <= 12)
			this.month = month;
		else
			throw new InvalidMonthException("Month is not valid");
		this.year = year;
	}


}
