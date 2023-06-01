package com.infotech.util;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {
	
	
	
	private static final String DB_DRIVER_CLASS="org.postgresql.Driver";
	private static final String DB_USERNAME="postgres";
	private static final String DB_PASSWORD="password@123";
	private static final String DB_URL ="jdbc:postgresql://localhost:5432/postgres";
	
	private static Connection connection = null;
	static{
		try {
			Class.forName(DB_DRIVER_CLASS);
			connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(){
		return connection;
	}
}
