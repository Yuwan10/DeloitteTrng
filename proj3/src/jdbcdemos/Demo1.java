package jdbcdemos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
			Scanner s= new Scanner(System.in);		
		System.out.println("Enter 1 or 2 1)view table 2)insert values");
		int option= s.nextInt();
		if(option==1)
		{printRecords();}
		else
		{insertRecords();
		}		
	}

	private static void printRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
				System.out.println("Connected");
				Statement s= connection.createStatement();
				ResultSet r= s.executeQuery("select * from hr.SUPPLIERS");
				
				while(r.next())
				{
					System.out.println(r.getString(1)+" ");
					System.out.println(r.getString(2));
				}
	}
	private static void insertRecords() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
	
		Connection connection= DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system");
				
				Statement s= connection.createStatement();
				int noofRecords = s.executeUpdate("insert into hr.SUPPLIERS values(100,'dELOITTE')");
				System.out.println(noofRecords+"affected");
				

}
}
