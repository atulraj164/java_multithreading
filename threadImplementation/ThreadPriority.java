package threadImplementation;

public class ThreadPriority {
	public static class MyThread extends Thread{
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println("child1-thread");
			}
		}
	}
	
	public static class MyThread2 extends Thread{
		@Override
		public void run() {
			for(int i=0;i<100;i++) {
				System.out.println("child2-thread");
			}
		}
	}
	
   public static void main(String[] args) {
	
	   System.out.println("main thread default priority- "+Thread.currentThread().getPriority());
	   Thread.currentThread().setPriority(9);
	   System.out.println("main thread - "+Thread.currentThread().getPriority());
	   MyThread t=new MyThread();
	   System.out.println("child thread- "+t.getPriority());//default priority =main thread priority

	  
	   //priority check
	   MyThread2 t2=new MyThread2();
	   t.setPriority(9);
	   t2.setPriority(2);
	   
	   t2.start();
	   t.start();
	  //child 1 finish first due to high priority
	   
}
}
