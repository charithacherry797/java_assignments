package com.capgemini.expectionhandling.exceptions;

import com.capgemini.exceptionhandling.main.Student;

public class AgeNotWithinRangeException extends Exception {
	public AgeNotWithinRangeException (String message) {
	 super(message);
	}
}

