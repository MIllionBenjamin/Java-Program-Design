package e4;

import java.awt.geom.Rectangle2D;
import java.util.*;

public class RunnableBank implements Runnable
{
	Thread t;
	String tName;
	int money;
	
	public RunnableBank(String name, int mon) 
	{
		tName = name;
		money = mon;
	}
	
	public void run() 
	{
		int B = 0;
		int C = 0;
		System.out.printf("Balance of account A: %d\n", money);
		try 
		{
		Thread.sleep(500);
		while(true)
		{
			double i = Math.random();
		}
		Thread.sleep(5000);
		}
		catch (InterruptedException e) 
		{
			System.out.println("Thread " +  tName + " interrupted.");
		}
		System.out.println("End of One Thread");
		
	}
	
	public void start() 
	{
		System.out.println("Starting " + tName);
		if(t == null)
		{
			t= new Thread(this, tName);
			t.start();
		}
	}
}