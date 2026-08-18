package CocurrentCollections;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurentModificationExceptionHandling extends Thread{
	
	static ConcurrentHashMap chm=new ConcurrentHashMap();
	
	public void run() {

		for(int i=0;i<10;i++) {
		
		System.out.println("putting into map bucket"+i);	
		
		try {
		Thread.sleep(1000);
		}catch(Exception e) {}
		
		chm.put(i, "job"+i);
			
		}
	}
	
	
      public static void main(String[] args) {
    	  
       ConcurentModificationExceptionHandling thread1=new ConcurentModificationExceptionHandling();
       thread1.start();
       
       try {
			Thread.sleep(3000);
			}catch(Exception e) {}
			
       Iterator it= chm.keySet().iterator();
       
       
       while(it.hasNext()) {
    	   System.out.println("Thread 1 executing bucket"+chm.get((Integer)it.next()));
    	   try {
    			Thread.sleep(3000);
    			}catch(Exception e) {}
    			
    	   
       }
			
     }
}
