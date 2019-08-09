package zoo;

public class ExceptionA {
	public void display () {
		int i=0;
		try {
			i=50/0;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Error occured");
		}
		System.out.println("HAHA"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ExceptionA d= new ExceptionA();
 d.display();
	}

}
