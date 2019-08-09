package designmethods;

public class PaymentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment payment1= Payment.getPayment();
		Payment p2= Payment.getPayment();
		payment1.pay(900);
		p2.pay(1000000);

	}

}
