import java.util.StringTokenizer;;


public class Demo {

	public static void main(String[] args)
	{
	
		
		String name="The quick brown fox jumps over the lazy dog";
			System.out.println(name.charAt(12));
			System.out.println(name.contains("is"));
			System.out.println(name.concat("and killed it"));
			System.out.println(name.endsWith("dogs"));
		    System.out.println(name.length());
		    System.out.println(name.replace("The","A"));
		    System.out.println(name.toLowerCase());
		    System.out.println(name.toUpperCase());
		    System.out.println(name.indexOf("a"));
		    System.out.println(name.lastIndexOf("e"));
		    String name2= name.substring(name.indexOf("j"));
		    System.out.println(name2);
		    String name3=name.substring(name.indexOf("T"), name.indexOf("j"));
		    System.out.println(name3);
	     
	    
	   
	 	 
	   		
	}}
