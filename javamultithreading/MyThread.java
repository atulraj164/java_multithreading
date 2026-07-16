package javamultithreading;

public class MyThread extends Thread{
         
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("child thread");
		}
	}
	@Override
	public void start() {
		super.start();
		for(int i=0;i<100;i++) {
			System.out.println("thread start");
		}
		
	}

	
}
