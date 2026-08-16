package threadGROUP;

public class SystemThread {
    public static void main(String[] args) {
		//system threads's child threads
    	
    	                             //main------->maingroup-------->parentgroup
    	ThreadGroup system= Thread.currentThread().getThreadGroup().getParent();
    	Thread[] threads=new Thread[system.activeCount()];
    	system.enumerate(threads);
    	
    	
    	for(Thread t:threads) {
    		System.out.println("Name: "+t.getName()+"\n"+"is daemon :"+t.isDaemon());
    	}
	}
}
