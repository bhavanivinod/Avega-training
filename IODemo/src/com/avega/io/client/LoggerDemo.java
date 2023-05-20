package com.avega.io.client;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.XMLFormatter;

public class LoggerDemo {
	//Logger logger=Logger.getLogger(this.getClass().getName());
	Logger logger=Logger.getGlobal();
	
	
	
	

	void logMsg() throws SecurityException, IOException
	{
		
		//LogManager.getLogManager().readConfiguration(new FileInputStream("src/logging.properties"));

		/*
		 * FileHandler f=new FileHandler("D:\\external Training\\log\\java.log");
		 * f.setFormatter(new MyFormatter());
		 * 
		 * logger.addHandler(f);
		 */
		
		
		ConsoleHandler c=new ConsoleHandler();
		c.setFormatter(new MyFormatter());
		logger.addHandler(c);
		logger.severe("crtical error");
		logger.warning("it may lead to error");
		logger.info("called logMsg method");
		logger.config("Some setting has been changed");
		logger.fine("fine _______");
		logger.finer("finer _______");
		logger.finest("finest _______");
		
		/*
		 * logger.setLevel(Level.FINER);
		 * 
		 * FileHandler f=new FileHandler("D:\\external Training\\log\\java.log");
		 * f.setFormatter(new XMLFormatter()); f.setLevel(Level.FINE);
		 * 
		 * logger.addHandler(f);
		 * 
		 * logger.severe("crtical error"); logger.warning("it may lead to error");
		 * logger.info("called logMsg method");
		 * logger.config("Some setting has been changed"); logger.fine("fine _______");
		 * logger.finer("finer _______"); logger.finest("finest _______");
		 */
	}
	
	public static void main(String[] args) {
		LoggerDemo logDemo=new LoggerDemo();
		try {
			logDemo.logMsg();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	
}
}
