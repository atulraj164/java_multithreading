package threadImplementation;

public class ThreadName {
	
	
//
	public static void main(String[] args) {
		
		Thread.currentThread().setName("parent-thread");
		//using hidden class
		Runnable r=new Runnable(){
			@Override
			public void run() {
				Thread.currentThread().setName("child-thread");
			for(int i=0;i<100;i++) {
				System.out.println(Thread.currentThread().getName());
			}
			}
		};
		
		Thread t=new Thread(r);
		t.start();
		for(int i=0;i<100;i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
