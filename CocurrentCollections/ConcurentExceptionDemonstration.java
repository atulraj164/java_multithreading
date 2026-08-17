package CocurrentCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurentExceptionDemonstration extends Thread{
	static ArrayList<String> al =new ArrayList<>();
	
	
	
	
		public void run(){
			for(int i=0;i<10;i++) {
			System.out.println("tryin to insert in al");
			try {
			Thread.sleep(1000);
			}catch(Exception e){}
			
			al.add("ee");
			}
		}
	
	
	
	
    public static void main(String[] args) throws Exception{
		al.add("aa");
		al.add("bb");
		al.add("cc");
		
		Iterator it=al.iterator();
		
		ConcurentExceptionDemonstration thread1=new	ConcurentExceptionDemonstration (); 
		thread1.start();

		while(it.hasNext()) {
			System.out.println(it.next());
			Thread.sleep(1000);
		}
		
		
	}
}
