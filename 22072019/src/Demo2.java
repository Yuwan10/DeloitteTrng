import java.io.File;
import java.io.IOException;

public class Demo2 {


			public static void main(String[] args) throws IOException {
				File f=new File("C:\\New folder");
				File f6=new File("C:\\");
				
				
				// TODO Auto-generated method stub
				File f1=new File("C:\\New folder\\Batch");
				
				File f2=new File("C:\\New folder\\Batch\\Batchmates.txt");
				File f3=new File("C:\\New folder\\Batch2");
				File f4=new File("C:\\New folder\\Batch3");
				File f5=new File("C:\\New folder\\Batch4");
				if(f6.exists())
				{File allFiles[]=f6.listFiles();
				for(File temp: allFiles)
				{
					if(temp.isDirectory())
					System.out.println(temp+" is directory");
					else
						System.out.println(temp+" is file");
				}	
					
					
				}
				else {
					f1.mkdirs();
					f2.createNewFile();
					f3.mkdirs();
					f4.mkdirs();
					f5.mkdirs();
			System.out.println("File and folder created");
				}


			

		}

}
