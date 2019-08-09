package demos;

public class Doctor
{String Doctorname;
 int fees;
 static int no=0;
public Doctor(String doctorname, int fees)
{       this();
		Doctorname = "A";
	this.fees =50000;
	no++;
}
public Doctor(String doctorname)
{
		Doctorname = "B";
		this.fees = 70000;
	no++;
}
public Doctor(int fees) {
	Doctorname = "C";
		this.fees = 50000;
	no++;
}	
public Doctor() {
Doctorname="D";
fees=60000;
no++;
}
public void display() {
	System.out.println("Doctor Name:"+Doctorname);
	System.out.println("Fees:"+fees);
}
public static void main(String[] args) {
Doctor d= new Doctor("A",70000);
Doctor d1= new Doctor("B");
Doctor d2= new Doctor(80000);
Doctor d3= new Doctor();
d.display();
d1.display();
d2.display();
d3.display();
System.out.println("No of Objects"+no);
}
}


