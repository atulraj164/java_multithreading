package daemonThread;

public class DaemonThreadFeatures {
    public static void main(String[] args) {
    	DaemonThread t=new DaemonThread();
    	
    	//thread created my non-daemon is allways non-saemon umtil explicitly converted into Daemon 
    	System.out.println(t.isDaemon());
    	t.setDaemon(true);
    	System.out.println(t.isDaemon());
    //	Thread.currentThread().setDaemon(true);// illeagalState Exception as main thread is allready started
    	
	}
}
