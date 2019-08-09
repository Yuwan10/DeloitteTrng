package collectiondemos;

import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
	Map<Integer,String> data= new TreeMap<Integer,String>();
	
	data.put(13, "a");

	data.put(12, "b");

	data.put(14, "c");

	data.put(15, "d");

	data.put(16, "e");
	System.out.println(data);

	}

}
