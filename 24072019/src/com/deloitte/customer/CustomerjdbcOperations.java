package com.deloitte.customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.deloitte.client.DbUtility;

public class CustomerjdbcOperations {
	public static void printCustomerRecords() throws ClassNotFoundException, SQLException, IOException {
		Connection connection= DbUtility.getMyConnection();
		
				System.out.println("Connected");
				Statement s= connection.createStatement();
				ResultSet r= s.executeQuery("select * from hr.customer3");
				
				while(r.next())
				{
					System.out.print(r.getString(1)+" ");
					System.out.print(r.getString(2)+" ");
					System.out.print(r.getString(3)+" ");
					System.out.print(r.getString(4));
					System.out.println("\n");
				}
	}
	public static void insertCustomerRecords() throws ClassNotFoundException, SQLException, IOException {
		
		Connection connection= DbUtility.getMyConnection();
		
				Statement s= connection.createStatement();
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter cust id");
				int custID=scan.nextInt();
				System.out.println("Enter cust name");
				String custName=scan.next();
				System.out.println("Enter cust add");
				String custAdd=scan.next();
				System.out.println("Enter billamount");
				int custBillamnt=scan.nextInt();
				
				int noofRecords = s.executeUpdate("insert into hr.customer3 values("+custID+",'"+custName+"','"+custAdd+"',"+custBillamnt+")");

				
				System.out.println(noofRecords+"affected");
				

}
public static void insertCustomerRecordsthruPS() throws ClassNotFoundException, SQLException, IOException {
		
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter cust id");
				int custID=scan.nextInt();
				System.out.println("Enter cust name");
				String custName=scan.next();
				System.out.println("Enter cust add");
				String custAdd=scan.next();
				System.out.println("Enter billamount");
				int custBillamnt=scan.nextInt();
				Connection connection= DbUtility.getMyConnection();
				PreparedStatement s= connection.prepareStatement("insert into hr.customer3 values(?,?,?,?)");
				
				s.setInt(1, custID);
				s.setString(2, custName);
				s.setString(3, custAdd);
				s.setInt(4, custBillamnt);
				int noofRecords= s.executeUpdate();

				
				System.out.println(noofRecords+"affected");
				

}
public static void deleteCustomerRecordsthruPS() throws ClassNotFoundException, SQLException, IOException {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter cust id");
	int custID=scan.nextInt();
	Connection connection= DbUtility.getMyConnection();
	PreparedStatement s= connection.prepareStatement("delete from hr.customer3 where customerid=(?)");
	s.setInt(1, custID);
	int noofRecords= s.executeUpdate();
	System.out.println(noofRecords+"affected");
}

}
