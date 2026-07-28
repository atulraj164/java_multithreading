package synchronisation;

import javamultithreading.main;

public class MainThread {
       public static void main(String[] args) {
		SynchroniseClass job=new SynchroniseClass();
	    MyThread t1=new MyThread(job,"srk");
	    MyThread t2=new MyThread(job,"akshay");
	    MyThread t3=new MyThread(job,"sallu");
	    t1.start();t2.start();t3.start();
	}
}
