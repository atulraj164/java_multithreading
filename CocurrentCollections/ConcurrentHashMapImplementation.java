package CocurrentCollections;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentHashMapImplementation {
     public static void main(String[] args) {
		ConcurrentHashMap<Integer,String> chm=new ConcurrentHashMap();
		 chm.put(1,"raj");
		 chm.put(2, "shama"); 
		 chm.putIfAbsent(1, "kaju");//put if key not present
		 chm.remove(2, "dald");//remove if key value same
		 chm.replace(1, "raj", "babbar");//change if previous naame is same as argument
		 
		 for (Integer i: chm.keySet()) {
			 System.out.println(chm.get(i));
			
		}
		 
		 
	}
}
