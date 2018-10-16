package e2;

import java.awt.print.Book;
import java.util.*;
import e2.MyInteger;


public class question1 
{
	
	public static Boolean isEven(int myint)
	{
		if(myint % 2 == 0)
			return true;
		else
			return false;
	}
	
	public static Boolean isOdd(int myint)
	{
		if(myint % 2 != 0)
			return true;
		else
			return false;
	}
	
	public static Boolean isPrime(int myint)
	{
		if(myint == 1 || myint == 2)
			return false;
		else
		{
			Boolean result = true;
			for(int i = 2; i < myint/2; i++)
				if(myint % i == 0)
					result = false;
			return result;
		}
	}
	
	public static void main(String [] args)
	{
		System.out.println("Enter the first number:");
		Scanner first = new Scanner(System.in);
		int num1 = first.nextInt();
		System.out.println("Enter the second number:");
		Scanner second = new Scanner(System.in);
		int num2 = second.nextInt();
		MyInteger my1 = new MyInteger(num1);
		MyInteger my2 = new MyInteger(num2);
		System.out.print("MyInteger is even: "+my1.isEven()+"\n");
		System.out.print("MyInteger is odd: "+my1.isOdd()+"\n");
		System.out.print("MyInteger is prime: "+my1.isPrime()+"\n");
		System.out.print("An Integer is even: "+isEven(num1)+"\n");
		System.out.print("An Integer is odd: "+isOdd(num1)+"\n");
		System.out.print("An Integer is prime: "+isPrime(num1)+"\n");
		System.out.print("My Integer equals to another MyInteger: "+my1.equals(my2)+"\n");
		System.out.print("My Integer equals to an Integer: "+my1.equals(num1)+"\n");
	}
	
}
