package synchronisation;

public class MyThread extends Thread{
   SynchroniseClass job;
   String Name;
   
   
          public MyThread (SynchroniseClass job,String Name) {
	         this.job=job;
	         this.Name=Name;
          }
          
          public void run() {
        	  job.display(Name);
          }
          
}
