package deadLock;

public class A {
	
	public synchronized void d1(B b) {
		System.out.println("T1 started D1");
		try {
			
		 Thread.sleep(500);
		 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		b.last();
	}

	public synchronized void last() {
		System.out.println("T2 entered Last Method");
	}

}
