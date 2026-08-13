package deadLock;

public class B {
    
	public synchronized void d2(A a) {
		System.out.println("T2 started D2");
		try {
			
		 Thread.sleep(500);
		 
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		a.last();
	}
	public synchronized void last() {
		System.out.println("T1 entered Last Method");
	}
}
