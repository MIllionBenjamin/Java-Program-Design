package e3;

import e3.Shape;

public class Rectangle_2 extends Shape_Abstract
{
	double width;
	double length;
	
	public Rectangle_2()
	{
		super();
		width = 1.0;
		length = 1.0;
	}
	
	public  Rectangle_2(double wid, double len) 
	{
		super();
		width = wid;
		length = len;
	}
	
	public  Rectangle_2(double wid, double len, String cl, boolean fld) 
	{
		super(cl, fld);
		width = wid;
		length = len;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	public double getLength() 
	{
		return length;
	}
	
	public void setWidth(double wid)
	{
		width = wid;
	}
	
	
	public void setLength(double len) 
	{
		length = len;
	}

	public double getArea()
	{
		return width * length;
	}
	
	public double getPerimeter() 
	{
		return 2 * (width + length);
	}
	
	public String toString() 
	{
		String r_sentence = "A Rectangle with width=";
		r_sentence += Double.toString(width);
		r_sentence += "and length=";
		r_sentence += Double.toString(length);
		r_sentence += ", which is a subclass of ";
		r_sentence += super.toString();
		return r_sentence;
	}
}
