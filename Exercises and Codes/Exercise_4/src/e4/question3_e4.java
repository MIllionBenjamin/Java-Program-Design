package e4;

import java.awt.geom.Rectangle2D;
import java.util.*;

import e4.RunnableDemo;

public class question3_e4 
{
	public static void main(String[] args) 
	{
		RunnableDemo R1 = new RunnableDemo("1", 1, 1000);
		R1.start();
		
		RunnableDemo R2 = new RunnableDemo("2", 1001, 2000);
		R2.start();
		
		RunnableDemo R3 = new RunnableDemo("3", 2001, 3000);
		R3.start();
	}
}
