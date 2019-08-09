package com.delloite.cms.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


import com.delloite.cms.model.Address;
import com.delloite.cms.model.Customer;

public class Client {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans3.xml");
   //     BeanFactory factory = new XmlBeanFactory(resource);
        Customer customer = (Customer)context.getBean("cust");
    
        System.out.println(customer);
        context.registerShutdownHook();

}
	}