package threadImplementation;

import javamultithreading.MyRunnable;
import javamultithreading.main;

public class Threadimp {
    public static void main(String[] args) {
	   //Thread constructors
    	
    	//default
    	Thread t1=new Thread();
    	t1.start();
    	
    	//assigning name to thread
    	Thread t2=new Thread("childThread");
        
    	//with runnable object
    	MyRunnable r=new MyRunnable();
    	Thread t3=new Thread(r);
    	
    	//Assigning name with runnable object
    	Thread t4=new Thread(r,"runnable child thread");
    	
    	//adding thred into a threadgroup
    	ThreadGroup tg=new ThreadGroup("myGroup");
    	Thread t5= new Thread(tg,r);
    	System.out.println(t5.getThreadGroup()+"    "+t5.getName());
    	
    	
    	//with threadgroup , runnable and name
    	
    	Thread t6= new Thread(tg,r,"participant-2");
    	System.out.println(t6.getThreadGroup()+"    "+t6.getName());
    	
    	//with stack size for the thread
    	
    	Thread t8= new Thread(tg,r,"participant-3",9);
  }
}
