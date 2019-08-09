
package com.delloite.cms.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.delloite.cms.dao.CustomerDAO;
import com.delloite.cms.model.Customer;
import com.delloite.utility.DbUtility;

public class CustomerDAOImpl implements CustomerDAO {



	AnnotationConfiguration configuration= new AnnotationConfiguration().configure();
	SessionFactory factory = configuration.buildSessionFactory();
	Session session= factory.openSession();
	@Override
	public List<Customer> getAllCustomers() {
		List<Customer> allCustomers= new ArrayList <Customer>();
		System.out.println("##GETTING THEM BOYS");
		session= factory.openSession();
		//select * from customerDB;
		/*Iterator<Customer> iterator= query.iterate();
		while(iterator.hasNext())
		{
			Customer customer=iterator.next();
			allCustomers.add(customer);
		}*/
	/*Criteria criteria= session.createCriteria(Customer.class);
		criteria.add(Restrictions.like("customerAddress", "Pubne"));
		return criteria.list();*/
		System.out.println(session.createQuery("select count(customerId) from com.delloite.cms.model.Customer").list().get(0));
			return session.createQuery("from com.delloite.cms.model.Customer").list();
			
	}


	@Override
	public boolean insertCustomer(Customer customer) {

		Session session= factory.openSession();
	Transaction transaction= session.beginTransaction();
		session.save(customer);
		transaction.commit();
		session.close();
		factory.close();
		System.out.println("Data saved");
		return true;
		
	}

	

	@Override
	public boolean updateCustomer(Customer customer) {
		session= factory.openSession();
		Transaction transaction= session.beginTransaction();
		session.update(customer);
		transaction.commit();
					return true;
	}

	
	@Override
	public boolean deleteCustomer(int customerId) {
	Session session2= factory.openSession();	
	Transaction transaction= session2.beginTransaction();
		Customer customer=new Customer();
		customer.setCustomerId(customerId);
     session2.delete(customer);	
		transaction.commit();
			return true;

	}

	@Override
	public Customer searchCustomerById(int customerId) {
		session= factory.openSession();
		Customer customer= (Customer) session.get(Customer.class, customerId);
		session.close();
		return customer;
		
	}


	@Override
	public boolean isCustomerExists(int customerId) {
		session= factory.openSession();
			Customer customer= (Customer) session.get(Customer.class, customerId);
		if(customer==null)
		{
		return false;
		}
		else
		{
			return true;
		}

	}

}
