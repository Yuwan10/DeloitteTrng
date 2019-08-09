package com.delloite.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.delloite.cms.config.AppConfiguration;
import com.delloite.cms.model.Address;
import com.delloite.cms.model.Customer;

public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
ApplicationContext context= new AnnotationConfigApplicationContext(AppConfiguration.class);

Customer customer = context.getBean(Customer.class);
Address address2=context.getBean(Address.class);

customer.setCustomerId(3);
customer.setCustomerName("Tao Wang");
customer.setCustomerAddress("Shanghai");
customer.setBillAmount(1000000);
address2.setaId(12);
address2.setCity("Shanghai");
address2.setState("China town");

//customer.setAddress(address2);


System.out.println(customer);

}
	}