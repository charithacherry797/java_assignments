package com.capgemini.files.model;

import java.io.File;

public class FileExistApplication {
	public boolean checkFileExist()
	{
		File file = new File("C:\\charitha\\corejava assignments\\day-2-assignments\\src\\Rectangle.java");
		if(file.exists())
		{
			System.out.println("File Exists");
			return true;
		}
		else
		{
			System.out.println("File does not Exists");
			return false;
		}
	}
}
