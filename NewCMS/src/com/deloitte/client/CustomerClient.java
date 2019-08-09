package com.deloitte.client;

import com.deloitte.cms.dao.CustomerDAO;
import com.deloitte.cms.dao.impl.CustomerDaoImpl;
import com.deloitte.cms.model.Customer;

public class CustomerClient {
	public static void main(String args[]) {
		int customerId=4;
		CustomerDAO customerDAO= new CustomerDaoImpl();
		boolean result = customerDAO.isCustomerExists(customerId);
		System.out.println(result);
		Customer customer= new Customer(4,"Babu","Las Vegas",19000);
		customer.setCustomerName("Bob");
		customer.setCustomerAddress("Los Angeles");
		customer.setBillAmount(20000);
		System.out.println(customerDAO.updateCustomer(customer));
		System.out.println(customerDAO.searchCustomerById(customerId));
		System.out.println(customerDAO.getAllCustomers());
	}

}
