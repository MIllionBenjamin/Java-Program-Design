package e2;

import java.util.*;
import java.math.*;

public class Circle2D 
{
	double posx;
	double posy;
	double radius;
	
	public Circle2D() 
	{
		// TODO Auto-generated constructor stub
		posx = 0;
		posy = 0;
		radius = 1;
	}
	
	public Circle2D(double x, double y, double rad)
	{
		posx = x;
		posy = y;
		radius = rad;
	}
	
	public double getArea()
	{
		return (radius*radius*Math.PI);
	}
	
	public double getPerimeter()
	{
		return (2*radius*Math.PI);
	}
	
	public Boolean contains(double px, double py)
	{
		if((px * px + py * py) <= radius * radius)
			return true;
		else
			return false;
	}
	
	public Boolean contains(Circle2D other)
	{
		if((Math.pow(posx - other.posx, 2) + Math.pow(posy - other.posy, 2)) <= (Math.pow(radius - other.radius, 2)))
			return true;
		else
			return false;
	}
	
	public Boolean overlaps(Circle2D other)
	{
		if((Math.pow(posx - other.posx, 2) + Math.pow(posy - other.posy, 2)) >= (Math.pow(radius - other.radius, 2))
				&& (Math.pow(posx - other.posx, 2) + Math.pow(posy - other.posy, 2)) <= (Math.pow(radius + other.radius, 2)))
			return true;
		else
			return false;
	}
	
}
