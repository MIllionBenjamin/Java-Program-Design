package e2;

import e2.question1.MyInteger;

public class MyInteger 
{
	
		int myint;
		
		
		public MyInteger() 
		{
			// TODO Auto-generated constructor stub
			myint = 0;
		}
		
		public MyInteger(int my) 
		{
			myint = my;
		}
		
		public Boolean isEven()
		{
			if(myint % 2 == 0)
				return true;
			else
				return false;
		}
		
		public Boolean isOdd()
		{
			if(myint % 2 != 0)
				return true;
			else
				return false;
		}
		
		public Boolean isPrime()
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
		
		public Boolean equals(int other)
		{
			if(myint == other)
				return true;
			else
				return false;
		}
		
		public Boolean equals(MyInteger others)
		{
			if(myint == others.myint)
				return true;
			else
				return false;
		}
		
	
}
