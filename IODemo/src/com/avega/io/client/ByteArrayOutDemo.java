package com.avega.io.client;

import java.io.ByteArrayOutputStream;
import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class ByteArrayOutDemo {
public static void main(String[] args) throws IOException   {
	ByteArrayOutputStream bout =new ByteArrayOutputStream();
	String str="This is an Demo for ByteArray streams";
	
	try {
		bout.write(str.getBytes());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
	
	FileOutputStream fout=null;
	try {
		fout = new FileOutputStream("cfout.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FileOutputStream fout1 = null;
	try {
		fout1 = new FileOutputStream("cfout1.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FileOutputStream fout2 = null;
	try {
		fout2 = new FileOutputStream("cfout2.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	FileOutputStream fout3 = null;
	try {
		fout3 = new FileOutputStream("cfout3.txt");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		bout.writeTo(fout);
		bout.writeTo(fout1);
		bout.writeTo(fout2);
		bout.writeTo(fout3);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	finally
	{
		fout.close();
		fout1.close();
		
		fout2.close();
		fout3.close();
	}
	
	
	
	
	
	
}
}
