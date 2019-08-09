package collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.deloitte.model.Customer;

public class Demo4 {

	public static void main(String[] args)
	{
		List <Customer> l=new ArrayList <Customer>();
		Customer c1=new Customer(1, "Neha", "Delhi", 8000);
		Customer c2=new Customer(2, "Snehaa", "Mumbai",7000);
		Customer c3=new Customer(3, "Michelle", "Chennai",6000);
		Customer c4=new Customer(4, "Mary", "Banglaore",2000);
		Customer c5=new Customer(5, "Ahmed", "Trichy",9000);
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		System.out.println("Please enter 1)Address 2)Name 3)BillAmount 4)id");
		Scanner s= new Scanner(System.in);
		int opt=s.nextInt();
		if(opt==1)
		{
			Collections.sort(l);
			System.out.println(l);}
		if(opt==2)
		{
			Collections.sort(l, new CustomerBillNameComparator());
			System.out.println(l);
		}
		if(opt==3)
		{
			Collections.sort(l, new CustomerBillAmntComparator());
			System.out.println(l);
			
		}
		if(opt==4)
		{
			Collections.sort(l, new Comparator<Customer>() 
			{

				@Override
				public int compare(Customer o1, Customer o2) {
					// TODO Auto-generated method stub
					if(o1.getCustomerId()<o2.getCustomerId())
					return -1;
					else
						return 0;
					
				}
				
			
			
			});
			System.out.println(l);
		}
		
		
		/*3
		
			Iterator<Customer> iterator=l.iterator();
			Iterator<Customer> iterator1=l.iterator();
			System.out.println("Customer whose bill is greater than 5000");
				while(iterator.hasNext())
				{
					Customer cust= iterator.next();
					if(cust.getBill()>5000)
					{
						System.out.println(cust);
					}
				}
				System.out.println("Customer whose address is Delhi");
				while(iterator1.hasNext())
				{
					Customer cust= iterator1.next();
					if(cust.getCustomerAdd()=="Delhi")
					{
						System.out.println(cust);
					}
		}
		*/
		
		
		
		
		
	}
	
}
