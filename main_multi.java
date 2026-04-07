package multithrading;

class a extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("hi");
			try {
			Thread.sleep(10);
		}catch(Exception e) {
			
		}
		}
	}
}
class b extends Thread{
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("hello");
	}
		}
}
 //using runnable interface

class c implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("hey");
		}			
	}
}
class d implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++){
			System.out.println("yay");
		}			
	}
}

//class to show case how mutable ,modifiable data gives wrong info in multi threading enviroment
class incrment{
	int incr=0;
	public synchronized void increase() {//Synchronised key word solve race condition it allows only one thread to invoke at a time
		incr++;
	}
}

public class main_multi {
	public static void main(String [] args) throws InterruptedException {
		
	    // a obj1=new a();
	     //b obj2=new b();
	     //obj1.start();
	     //obj2.start();
	    // System.out.println(obj1.getPriority());
	     //obj1.setPriority(10);
		
		/*	Runnable c1=new c();
		 Thread c2=new Thread(c1);
		 c2.start();
		  Runnable d1=new d();
		  Thread d2=new Thread(d1);
		  d2.start();
			*/
			
			//using lamda
			incrment c=new incrment();
		  Runnable e=()->{
		   for(int i=0;i<1000;i++){
				c.increase();
			}
		  };
		 Thread e1=new Thread(e);
		 Runnable f=()->{
			   for(int i=0;i<1000;i++){
					c.increase();
				}
			  };
			 Thread f1=new Thread(e);
	     e1.start();
	     f1.start();
		 e1.join();//to frrez main thread to execute further statment till f1 e1 exucutes
		 f1.join();
		 System.out.println(c.incr);
		 
		}
}
