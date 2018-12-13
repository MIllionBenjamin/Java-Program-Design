package e3;

import e3.Shape_Abstract;
import e3.Circle_2;
import e3.Rectangle_2;
import e3.Square_2;

public class question2 
{
	public static void main() 
	{
		Shape_Abstract s1 = new Circle_2(5.5, "RED", false); System.out.println(s1); System.out.println(s1.getArea()); System.out.println(s1.getPerimeter()); System.out.println(s1.getColor()); System.out.println(s1.isFilled()); System.out.println(s1.getRadius());
		// Upcast Circle to Shape // which version?
		// which version? // which version?
		Circle_2 c1 = (Circle_2)s1; System.out.println(c1); System.out.println(c1.getArea()); System.out.println(c1.getPerimeter()); System.out.println(c1.getColor()); System.out.println(c1.isFilled()); System.out.println(c1.getRadius());
		Shape_Abstract s3 = new Rectangle_2(1.0, 2.0, "RED", false); 
		System.out.println(s3); System.out.println(s3.getArea()); System.out.println(s3.getPerimeter()); System.out.println(s3.getColor()); System.out.println(s3.getLength());
		Rectangle_2 r1 = (Rectangle_2)s3; // downcast System.out.println(r1); System.out.println(r1.getArea()); System.out.println(r1.getColor()); System.out.println(r1.getLength());
		// Downcast back to Circle
		// Upcast
		Shape_Abstract s4 = new Square_2(6.6); // Upcast System.out.println(s4); System.out.println(s4.getArea()); System.out.println(s4.getColor()); System.out.println(s4.getSide());
		// Take note that we downcast Shape s4 to Rectangle, // which is a superclass of Square, instead of Square
		 
		 
		Rectangle_2 r2 = (Rectangle_2)s4; System.out.println(r2); System.out.println(r2.getArea()); System.out.println(r2.getColor()); System.out.println(r2.getSide()); System.out.println(r2.getLength());
		// Downcast Rectangle r2 to Square
		Square_2 sq1 = (Square_2)r2; System.out.println(sq1); System.out.println(sq1.getArea()); System.out.println(sq1.getColor());
		System.out.println(sq1.getSide()); System.out.println(sq1.getLength());
	}
}
