package e4;

import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class question2_e4 
{
	public static void main(String[] args) 
	{
		double [] array = new double[100];
		for(int i = 0; i < 100; i++)
		{
			array[i] = Math.random() * 100;
		}
		System.out.println("Enter Input: (an integer)");
		try
		{
			Scanner input = new Scanner(System.in);
			int inputIndex = input.nextInt();
			if(inputIndex >= 100 || inputIndex < 0)
				throw new ArrayIndexOutOfBoundsException();
			else
				System.out.print(array[inputIndex]);
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println("Out of Bounds");
			System.exit(-1);
		}
	}
		
}
