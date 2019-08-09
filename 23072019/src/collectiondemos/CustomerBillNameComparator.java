package collectiondemos;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerBillNameComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		// TODO Auto-generated method stub
		if(o1.getCustomerName().compareTo(o2.getCustomerName())<0)
		return -1;
		else
			return 0;
	}
	

}
