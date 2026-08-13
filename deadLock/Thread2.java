package deadLock;

public class Thread2 extends Thread{
   A a=new A();
   B b=new B();
   
   public void run() {
	   b.d2(a);
   }
	
}
