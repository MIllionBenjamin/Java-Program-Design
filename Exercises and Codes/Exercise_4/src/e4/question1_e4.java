package e4;

import java.util.*;
import java.math.*;
import java.lang.*;
import java.io.*;

public class question1_e4 
{
	static int bin2Dec(String inputString)
	{
		int dec = 0;
		try
		{
			for(int i = 0; i < inputString.length(); i++)
			{
			
				if(inputString.charAt(i) == '1')
					dec += Math.pow(2, inputString.length() - 1 - i);
				else if (inputString.charAt(i) == '0') 
				{
					continue;
				}
				else 
					throw  new NumberFormatException();
			
			}
		}
		catch(NumberFormatException e1)
		{
			System.out.println("Input String Invalid!");
			return 0;
		}
		return dec;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("Enter Input: (a binary string)");
		Scanner input = new Scanner(System.in);
		String inputString = input.nextLine();
		System.out.print(bin2Dec(inputString));
	}
		
}
