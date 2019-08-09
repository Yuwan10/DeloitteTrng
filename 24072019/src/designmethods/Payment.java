package designmethods;

public class Payment {
	static Payment payment= new Payment();
	private Payment()
	{System.out.println("Payment object created");}
public static Payment getPayment()
{
	return payment;
}
public void pay(int amount)
{
	System.out.println("INR Received"+amount+"");
}
}

