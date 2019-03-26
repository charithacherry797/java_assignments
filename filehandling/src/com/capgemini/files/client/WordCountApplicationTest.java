package com.capgemini.files.client;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.Test;

import com.capgemini.files.model.WordCountApplication;

class WordCountApplicationTest {

	@Test
	public void testForCountingWords() throws IOException 
	{
		WordCountApplication wordCount = new WordCountApplication();
		assertEquals(131, wordCount.checkWordCount());
	}


}
