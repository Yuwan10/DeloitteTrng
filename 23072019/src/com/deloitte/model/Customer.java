package com.deloitte.model;

import java.io.Serializable;

import com.delloite.exceptions.NegativeBillAmountException;

public class Customer implements Serializable,Comparable<Customer>{
 
    private int customerId;
    private String customerName;
    private String customerAdd;
    private int bill;
 
    public Customer(int customerId, String customerName, String customerAdd, int bill) {
        super();
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerAdd = customerAdd;
       
			if (bill>0) {
				this.bill = bill;}
			 	else
			 		try {	{throw new NegativeBillAmountException("Bill cant be Negative");
				}
			 		} catch (NegativeBillAmountException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         
    }
 
    public int getCustomerId() {
        return customerId;
    }
 
    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
 
    public String getCustomerName() {
        return customerName;
    }
 
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
 
    public String getCustomerAdd() {
        return customerAdd;
    }
 
    public void setCustomerAdd(String customerAdd) {
        this.customerAdd = customerAdd;
    }
 
    public int getBill() {
        return bill;
    }
 
    public void setBill(int bill) {
    	if (bill>0) {
			this.bill = bill;}
		 	else
		 		try {	{throw new NegativeBillAmountException("Bill cant be Negative");
			}
		 		} catch (NegativeBillAmountException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
     
    }
 
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + bill;
        result = prime * result + ((customerAdd == null) ? 0 : customerAdd.hashCode());
        result = prime * result + customerId;
        result = prime * result + ((customerName == null) ? 0 : customerName.hashCode());
        return result;
    }
 
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Customer other = (Customer) obj;
        if (bill != other.bill)
            return false;
        if (customerAdd == null) {
            if (other.customerAdd != null)
                return false;
        } else if (!customerAdd.equals(other.customerAdd))
            return false;
        if (customerId != other.customerId)
            return false;
        if (customerName == null) {
            if (other.customerName != null)
                return false;
        } else if (!customerName.equals(other.customerName))
            return false;
        return true;
    }
 
    @Override
    public String toString() {
        return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerAdd=" + customerAdd
                + ", bill=" + bill + "]\n";
    }

	@Override
	public int compareTo(Customer o) {
		// TODO Auto-generated method stub
		if((this.getCustomerAdd().compareTo(o.getCustomerAdd())<0))
			return -1;
		else
		return 0;
	}

	
}