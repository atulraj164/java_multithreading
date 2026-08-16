package renntrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Job {

	ReentrantLock rl=new ReentrantLock();
	
	//lock() method
	public void displayLock(String name) {
	
		rl.lock();
		for(int i=0;i<9;i++) {
			
			System.out.println(name);
			
			try {
			Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		rl.unlock();
		
	}
	
	//tryLock()
	
	public void displayTryLock(String name) {
		
		if(rl.tryLock()) {
			System.out.println(Thread.currentThread().getName()+" got the Lock");
		for(int i=0;i<9;i++) {
			
			System.out.println(name);
			
			try {
			Thread.sleep(100);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		rl.unlock();
		}else {
			System.out.println(Thread.currentThread().getName()+"couldn't get Lock Executing Non-Critical Code");
		}
	
		
	}

	public void displayTryLockWithTime(String name) {
		//do {
		try {
		if(rl.tryLock(500,TimeUnit.MILLISECONDS)) {
		System.out.println(Thread.currentThread().getName()+" got the Lock");
		
		for(int i=0;i<9;i++) {
			
			System.out.println(name);
			
			try {
			Thread.sleep(1000);
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		rl.unlock();
		//break;
	}
		else {
			System.out.println(Thread.currentThread().getName()+"couldn't get Lock Trying Again");
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		//}while(true);
		
	
	
	}
}

