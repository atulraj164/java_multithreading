package renntrantLock;

public class RenntrantLockDemo {
  public static void main(String[] args) {
	 Job job=new Job();
	MyThread t1=new MyThread(job,"dhoni");
	MyThread t2=new MyThread(job,"kolhi");
	t1.start();
	t2.start();
	
}
}
