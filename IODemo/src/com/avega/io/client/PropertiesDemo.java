package com.avega.io.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {
public static void main(String[] args) {
	Properties prop=new Properties();
	try {
		prop.load(new FileInputStream("D:\\external Training\\data.properties"));
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	System.out.println(prop.getProperty("username"));
	System.out.println(prop.getProperty("password"));
	System.out.println(prop.getProperty("servername"));
}
}
