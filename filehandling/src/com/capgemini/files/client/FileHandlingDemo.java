package com.capgemini.files.client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandlingDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * File file=new File("C:\charitha\corejava assignments");
		 * System.out.println(file.exists()); File folder=new
		 * File("C:\\charitha\\corejava assignments\\day-2-assignments");
		 * System.out.println(folder.exists());
		 */
		/*
		 * File file=new File("test.txt"); if(!file.exists()) { file.createNewFile();
		 * System.out.println("file is created sucessfully"); }
		 */
//FileWriter writer=new FileWriter(file);
//BufferedWriter writer=new BufferedWriter(new FileWriter(file));
/*PrintWriter writer=new PrintWriter(new FileWriter(file,true));
writer.write("hello..");
writer.write("how are you???");
writer.write("i am fine..");
writer.write("Byee...");
writer.close();
System.out.println("content has been return suceesfully");

*/
		/*
		 * } FileReader reader=new
		 * FileReader("C:\\charitha\\corejava assignments\\day-2-assignments\\src\\Employee.java"
		 * ); BufferedReader bReader=new BufferedReader(reader); PrintWriter writer=new
		 * PrintWriter("BankAccount.java"); String content;
		 * while((content=bReader.readLine())!=null) { //System.out.println(content);
		 * writer.println(content); } System.out.println("--success--"); writer.close();
		 * bReader.close(); reader.close();
		 */
	
		/*
		 * File windowDirectory=new File("c:\\windows");
		 * System.out.println(windowDirectory.isDirectory()); String
		 * content[]=windowDirectory.list(); for(String s:content) {
		 * System.out.println(s); }
		 */
		File newDir=new File("myDir");
		if(!newDir.exists()) {
			newDir.mkdir();
			System.out.println("folder is successfully created..");
		}
		File file=new File(newDir,"myfile.txt");
		if(!file.exists()) {
			file.createNewFile();
			System.out.println("file is suceesfully created.");
		}
		}
	
	
	}

