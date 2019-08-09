package com.deloitte.client;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.deloitte.customer.CustomerjdbcOperations; 

public class Client {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);		
		System.out.println("Enter 1 or 2 1)view table 2)insert values 3)INSERT THRU PS 4)Delete thru PS");
		int option= s.nextInt();
		if(option==1)
		{CustomerjdbcOperations.printCustomerRecords();}
		else if(option==2)
		{CustomerjdbcOperations.insertCustomerRecords();
		}		
		else if (option==3) {
			CustomerjdbcOperations.insertCustomerRecordsthruPS();
			}
		else if(option==4)
		{
			CustomerjdbcOperations.deleteCustomerRecordsthruPS();
		}
		
	}
}
	


