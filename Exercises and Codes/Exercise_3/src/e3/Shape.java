package e3;

public class Shape 
{
	String color;
	boolean filled;
	
	public Shape()
	{
		color = "green";
		filled = true;
	}
	
	public Shape(String cl, boolean fld)
	{
		color = cl;
		filled = fld;
	}
	
	public String getColor() 
	{
		return color;
	}
	
	public void setColor(String cl) 
	{
		color = cl;
	}
	
	public boolean isFilled() 
	{
		return filled;
	}
	
	public void setFilled(boolean fld)
	{
		filled = fld;
	}
	
	public String toString() 
	{
		String sentence = "A Shape with color of ";
		String condition = color + " and ";
		if(filled)
			condition += "filled";
		else
			condition += "Not filled";
		sentence += condition;
		return sentence;
	}
}
