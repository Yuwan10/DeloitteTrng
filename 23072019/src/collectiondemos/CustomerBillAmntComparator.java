package collectiondemos;

import java.util.Comparator;

import com.deloitte.model.Customer;

public class CustomerBillAmntComparator implements Comparator<Customer> {

	@Override
	public int compare(Customer o1, Customer o2) {
		if(o1.getBill()<o2.getBill())
		// TODO Auto-generated method stub
		return -1;
		else
			return 0;
		
	}

}
