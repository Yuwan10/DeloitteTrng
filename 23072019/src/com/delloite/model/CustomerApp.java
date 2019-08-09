package com.delloite.model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.deloitte.model.Customer;

public class CustomerApp {

	public static void main(String[] args) {
		Customer c= new Customer(1,"A","Bangalore",-1000);
       System.out.println(c); 
	}
}
	class Demo5
	{
	public static void main(String[] args) throws FileNotFoundException, IOException {

		writeObjectFromFile();
		}

	public static void writeObjectFromFile() throws FileNotFoundException, IOException {
		//TODO Auto-generated method stub
		ObjectOutputStream Stream = new ObjectOutputStream(new FileOutputStream(("abc.txt")));
		Customer c=new Customer(1,"C","Chennai",10000);
		Stream.writeObject(c);
		Stream.close();
		System.out.println(c);
			
	}	
	}
	
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             

