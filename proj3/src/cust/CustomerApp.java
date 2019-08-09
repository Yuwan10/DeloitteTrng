package cust;

public class CustomerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer c1= new Customer(1,"A","Bangalore",2000);
		Customer c2= new Customer(2,"B","Delhi");
		Customer c3= new Customer(1,"C");
		Customer c4= new Customer();
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		c3.setCustomerName("Z");
		System.out.println(c3);
	}

}
