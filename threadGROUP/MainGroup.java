package threadGROUP;

public class MainGroup {
    public static void main(String[] args) {
    	System.out.println( Thread.currentThread().getName());//main thread
		System.out.println( Thread.currentThread().getThreadGroup().getName());//main thread parent group
		//parent group of main group
		                   //main------------------>maingrp------->system
		System.out.println( Thread.currentThread().getThreadGroup().getParent().getName());
		
		
		//thread group creation
		
		
		ThreadGroup FirstGroup=new ThreadGroup("FirstGroup");
		System.out.println(FirstGroup.getName());
		System.out.println(FirstGroup.getName()+"'s parent group = "+ FirstGroup.getParent().getName());
		
		
		//making tg parent group of FirstGroup
		ThreadGroup SecondGroup=new ThreadGroup(FirstGroup,"SecondGroup");
		System.out.println(SecondGroup.getName());
		System.out.println(SecondGroup.getName()+"'s parent group = "+ SecondGroup.getParent().getName());
		
		
		
		
	}
}
