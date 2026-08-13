package daemonThread;

public class DaemonThread extends Thread{
      public void run() {
    	  System.out.println("DaemonThread has started");
    	  
    	  try {
    		  Thread.sleep(5);
    	  }catch(InterruptedException e) {
    		  e.printStackTrace();
    	  }
    	  
    	  for(int i=0;i<1000;i++) {
    		  System.out.println("DaemonThread"+ i);
    	  }
    	  
      }
}
