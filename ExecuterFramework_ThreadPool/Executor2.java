package ExecuterFramework_ThreadPool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Executor2 {
        public static void main(String[] args) throws Exception{
        	 ExecutorService service=Executors.newFixedThreadPool(3);
        	 
        		CallableJob[] jobs= {new CallableJob(5),
        				new CallableJob(10),
        				new CallableJob(15),
        				new CallableJob(20),
        				new CallableJob(25)
        		};
        		
        		
        		List<Future> f=new ArrayList<>();
        		
        		
        		for (CallableJob callableJob : jobs) {
					f.add(service.submit(callableJob));
				}
        		service.shutdown();
        		
        	
        		for (Future future : f) {
					System.out.println((int)future.get());
				}
        		
		}
}
