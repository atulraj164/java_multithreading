package ExecuterFramework_ThreadPool;

import java.util.concurrent.Callable;

public class CallableJob implements Callable {

	int num;
	
	public CallableJob(int num) {
		this.num=num;
	}
	@Override
	public Object call() throws Exception {
		
		int sum=0;
		Thread.sleep(100);
		for(int i=0;i<num;i++) {
			System.out.println("Thread executing sum of  "+num+" = "+Thread.currentThread().getName());
			sum+=i;
			Thread.sleep(100);
		}
		return sum;
	}

}
