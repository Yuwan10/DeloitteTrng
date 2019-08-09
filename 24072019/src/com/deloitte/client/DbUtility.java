package com.deloitte.client;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbUtility {
	public static Connection getMyConnection() throws SQLException, ClassNotFoundException, IOException
	{
		Connection connection=null;
		FileReader r= new FileReader("C:\\New folder\\N.properties");
		Properties p=new Properties();
		p.load(r);
		String driver=p.getProperty("driver");
		String url=p.getProperty("url");
		String username=p.getProperty("username");
		String password=p.getProperty("password");
		
		
		Class.forName(driver);
		
		connection= DriverManager.getConnection(url,username,password);
		return connection;
	}

}
