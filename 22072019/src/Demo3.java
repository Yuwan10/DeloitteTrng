import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo3 {

	public static void main(String[] args) throws IOException {
		
	FileReader f5= new FileReader("C:\\\\New folder\\\\Hello.txt") ;
	int i=0;
	while((i=f5.read())!=-1)
	{
		System.out.print((char)i);
	}
	
		
	f5.close();	
	}

}
