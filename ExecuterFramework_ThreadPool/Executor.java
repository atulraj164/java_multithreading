package ExecuterFramework_ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Executor {
	
  public static void main(String[] args) {
	  
	  //three Threads are responsible to execute 5 jobs
	 ExecutorService service=Executors.newFixedThreadPool(3);
	 
	RunnableJob[] jobs= {new RunnableJob("arya"),
			new RunnableJob("loko"),
			new RunnableJob("varma"),
			new RunnableJob("kavya"),
			new RunnableJob("anupurna")
	};
	
	for (RunnableJob job : jobs) {
		service.submit(job);
	}
	service.shutdown();
}
  
}
