package com.deloitte.model;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Props {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Properties p=new Properties();
FileReader r= new FileReader("C:\\New folder\\N.properties");
p.load(r);
System.out.println(p.get("username"));
System.out.println(p.get("password"));
System.out.println(p.get("url"));
System.out.println(p.get("driver"));
System.out.println(p.get("display"));

	}

}
