package deadLock;


public class Thread1 {
      public static void main(String[] args) {
		Thread2 t2=new Thread2();
		t2.start();
		t2.a.d1(t2.b);
	
	}
}
