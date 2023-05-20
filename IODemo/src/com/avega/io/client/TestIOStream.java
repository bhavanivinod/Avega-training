package com.avega.io.client;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class TestIOStream {
public static void main(String[] args) throws IOException {
		/*
		 * int ir =System.in.read(); System.out.println((char)ir);
		 */
		/*
		 * InputStreamReader irs=new InputStreamReader(System.in); int valu=0;
		 * 
		 * while((valu=irs.read())!=-1) { System.out.print((char)valu); }
		 */
	
		/*
		 * InputStreamReader irs=new InputStreamReader(System.in); BufferedReader br=new
		 * BufferedReader(irs);
		 */
	
		/*
		 * System.out.println("Please enter the conten to th efile"); BufferedReader
		 * br=new BufferedReader(new InputStreamReader(System.in)); String
		 * str=br.readLine();
		 */
	
		/*
		 * DataInputStream din=new DataInputStream(System.in); din.readLine();
		 */
	
		/*
		 * FileOutputStream fout=new
		 * FileOutputStream("D:\\external Training\\data.txt");
		 * 
		 * fout.write(str.getBytes());
		 */
	
	
		
		  File f=new File("data.txt"); 
		/*
		 * FileInputStream fin=new FileInputStream("D:\\external Training\\data.txt");
		 */
		  
		 
		/*
		 * int i; while((i=fin.read())!=-1) { System.out.print((char)i); }
		 */
	
		  
		  BufferedReader br=new BufferedReader(new FileReader("D:\\external Training\\data.txt"));
	String str=br.readLine();
	System.out.println(str);
	
}
}
