package threadGROUP;

public class MyThread extends Thread{
   
	String string;
	public MyThread(ThreadGroup parentGroup, String string) {
		super(parentGroup,string);//since Thread class has constructor to add thread into a group adn give name
		this.string=string;
	}

	public void run() {
		System.out.println(string);
		
		try {
		Thread.sleep(5000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
