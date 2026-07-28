package synchronisation;

import java.io.IOException;

public class SynchroniseClass {
      String Name;
      public synchronized void display(String Name) {
    	  for(int i=0;i<10;i++) {
    		  System.out.println("good morning  :   ");
    		  try {
    		  Thread.sleep(100);
    		  }catch(InterruptedException e) {
    		  }
    		  System.out.println(Name);
    	  }
      }
}
