package renntrantLock;

public class MyThread extends Thread{
     String name;
     Job job;
     
     public  MyThread(Job job,String name) {
    	  this.job=job;
    	  this.name=name;
     }
     
     public void run() {
    	//job.displayLock(name);
    	//job.displayTryLock(name);
    	 job.displayTryLockWithTime(name);
    	
     }
     
     
}
