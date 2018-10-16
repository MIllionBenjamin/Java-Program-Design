package s;
import java.io.*;
import java.util.*;

public class question1 
{
	public static void main(String [] args)
	{
		 Scanner in = new Scanner(System.in);    //Scanner类
		 System.out.println("Please enter an integer: ");
		 int n = in.nextInt();
		 int i, j, k, m, p, q;
		 for(i = 1; i <= n; i++)
		 {
			 for(j = 1; j <= (2*(n-i)); j++)
				 System.out.printf(" ");
			 for(k = i; k > 1; k--)
				 System.out.printf("%d ", k);
			 for(m = 1; m <= i; m++)
				 System.out.printf("%d ", m);
			System.out.println('\n');
		 }
		 
	}
}
