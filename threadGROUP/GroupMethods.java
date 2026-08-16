package threadGROUP;

public class GroupMethods {
    public static void main(String[] args) throws InterruptedException{
    	ThreadGroup ParentGroup=new ThreadGroup("ParentGroup");
    	ThreadGroup ChildGroup=new ThreadGroup(ParentGroup,"ChildGroup");
    	
    	
    	MyThread t1=new MyThread(ParentGroup,"childThread1");
    	MyThread t2=new MyThread(ParentGroup,"childThread2");
    	
    	t1.start();
    	t2.start();
    	
    	
    	System.out.println(ParentGroup.activeCount());
    	System.out.println(ParentGroup.activeGroupCount());
    	
    	ParentGroup.list();
    	
    	Thread.sleep(5000);
    	
    	System.out.println(ParentGroup.activeCount());
    	System.out.println(ParentGroup.activeGroupCount());
    	
    	System.out.println(t1.isAlive());
    	System.out.println(t2.isAlive());
    	
    	
    	
	}
}
