package ExecuterFramework_ThreadPool;

public class RunnableJob implements Runnable {
      String name;
      
      public RunnableJob(String name) {
    	  this.name=name;
      }
      
      public void run() {
    	  System.out.println(name+"job started by "+Thread.currentThread().getName());
    	  try {
    		  Thread.sleep(1000);
    	  }catch(Exception e){}
    	  System.out.println(name+"job completed by "+Thread.currentThread().getName());
      }
 
}
