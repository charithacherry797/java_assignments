package com.capgemini.files.client;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.LineCountApplication;

class LineCountApplicationTest {

	@Test
	public void testForCountingLines() throws IOException 
	{
		LineCountApplication lineCount = new LineCountApplication();
		assertEquals(29, lineCount.checkLineCount());
	}

}
