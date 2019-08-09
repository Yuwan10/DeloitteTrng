package com.delloite.cms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.dao.impl.CustomerDAOImpl;
import com.delloite.cms.model.Customer;
import com.delloite.cms.service.CustomerService;
import com.sun.org.apache.bcel.internal.generic.NEW;
@Controller
public class CustomerController {
	@Autowired(required=false)
	CustomerService customerservice;
	@RequestMapping("/addCustomer")
	public ModelAndView addCustomer(Customer customer)
	{
	 
	 customerservice.insertCustomer(customer);
	 return new ModelAndView("sayHello","a",customer);
	}
	@RequestMapping("/updateCustomer")
	public ModelAndView updateCustomer(Customer customer)
	{
	 
	 customerservice.updateCustomer(customer);
	 return new ModelAndView("sayHello","a",customer);
	}
	@RequestMapping("/customerDetailsbyId")
	public ModelAndView searchCustomerByIdForm(Customer customer)
	{
	 Customer customer2= new Customer();
	 customer2 =customerservice.searchCustomerById(customer.getCustomerId()); 
	 return new ModelAndView("customerDetailsbyId","command",customer2);
	}

}
