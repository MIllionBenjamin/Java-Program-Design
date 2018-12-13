package e4;

import java.awt.geom.Rectangle2D;
import java.util.*;

public class RunnableDemo implements Runnable
{
	Thread t;
	String tName;
	int begin, end;
	
	public RunnableDemo(String name, int be, int e) 
	{
		tName = name;
		begin = be;
		end = e;
	}
	
	public void run() 
	{
		System.out.printf("Find Prime Numbers: (%d, %d):\n", begin, end);
		try 
		{
		Thread.sleep(5000);
		for(int i = begin; i <= end; i++)
		{
			if(i == 2)
				System.out.print(i + " ");
			else
			{
				int p = 0;
				for(int j = 2; j < Math.pow(i, 0.5); j++)
					if(i % j == 0)
					{
						p = 1;
						break;
					}
				if(p == 0)
					System.out.print(i + " ");
			}
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