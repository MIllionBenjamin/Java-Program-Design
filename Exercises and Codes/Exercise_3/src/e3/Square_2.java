package e3;

import e3.Rectangle;

public class Square_2 extends Rectangle_2
{
	public Square_2() 
	{
		super();
	}
	
	public Square_2(double side) 
	{
		super(side, side);
	}
	
	public Square_2(double side, String cl, boolean fld) 
	{
		super(side, side, cl, fld);
	}
	
	public double getSide() 
	{
		return width;
	}
	
	public void segtSide(double sid) 
	{
		width = sid;
		length = sid;
	}
	
	public void setLength(double sid)
	{
		width = sid;
		length = sid;
	}
	public void setWidth(double sid)
	{
		width =sid;
		length = sid;
	}
	
	public String toString() 
	{
		String s_sentence = "A Square with side=";
		s_sentence += Double.toString(width);
		s_sentence += ", which is a subclass of ";
		s_sentence += super.toString();
		return s_sentence;
	}
}
