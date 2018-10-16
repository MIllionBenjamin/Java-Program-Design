package e2;

import e2.Circle2D;
import java.util.*;

public class question2 
{
	public static void main(String [] args)
	{
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		Circle2D c2 = new Circle2D(4, 5, 10.5);
		Circle2D c3 = new Circle2D(3, 5, 2.3);
		System.out.print("Area: "+c1.getArea()+"\n");
		System.out.print("Perimeter: "+c1.getPerimeter()+"\n");
		System.out.print("Contains (3, 3): "+c1.contains(3, 3)+"\n");
		System.out.print("Contains c2 "+c1.contains(c2)+"\n");
		System.out.print("Overlaps c3: "+c1.overlaps(c3)+"\n");
	}
}
