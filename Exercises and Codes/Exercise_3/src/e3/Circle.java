package e3;

import e3.Shape;
import java.math.*;

public class Circle extends Shape 
{
	double radius;
	
	public Circle() 
	{
		super();
		radius = 1.0;
	}
	
	public Circle(double rad)
	{
		super();
		radius = rad;
	}
	
	public Circle(double rad, String cl, boolean fld) 
	{
		color = cl;
		filled = fld;
		radius = rad;
	}
	
	public double getRadius() 
	{
		return radius;
	}
	
	public void setRadius(double rad)
	{
		radius = rad;
	}
	
	public double getArea() 
	{
		return Math.pow(radius, 2) * Math.PI;
	}
	
	public double getPerimeter() 
	{
		return radius * 2 * Math.PI;
	}
	
	public String toString() 
	{
		String c_sentence = "A Circle with radius=";
		c_sentence += Double.toString(radius);
		c_sentence += ",which is a subclass of ";
		c_sentence += super.toString();
		return c_sentence;
	}
}
