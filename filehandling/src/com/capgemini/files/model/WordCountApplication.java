package com.capgemini.files.model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountApplication {
	public int checkWordCount() throws IOException
	{
		FileReader reader = new FileReader("C:\\charitha\\corejava assignments\\day-2-assignments\\src\\Rectangle.java");
		BufferedReader breader = new BufferedReader(reader);
		int count = 0;
		String content;
		while ((content=breader.readLine()) != null)
		{
			String s[] = content.split(" ");
			
			
		}
		System.out.println("Words Counted successfully");
		breader.close();
		reader.close();
		return count;
	}
}
