package daemonThread;

public class NonDaemonThread {
           public static void main(String[] args) {
			System.out.println("NonDaemonThread has started");
			DaemonThread t=new DaemonThread();t.setDaemon(true);
			t.isDaemon();
			t.start();
			System.out.println("NonDaemonThread has Finished");
			
			//if NonDaemonThread has Finished then all DaemonThread will auto terminated
		}
}
