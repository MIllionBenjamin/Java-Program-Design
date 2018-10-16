package e2;

import e2.Engine;

public class Vehicle
{
	private int seatingCapacity;
	private double tireSize;
	private double length;
	private double width;
	private double height;
	private Engine eng = new Engine();
	
	public Vehicle() 
	{
		seatingCapacity = 0;
		tireSize = 0;
		length = 0;
		width = 0;
		height = 0;
	}
	
	public Vehicle(int sC, double tS, double len, double wid, double hei, 
			double dC, double pow, double tor, int cN) 
	{
		seatingCapacity = sC;
		tireSize = tS;
		length = len;
		width = wid;
		height = hei;
		eng.setEngine(dC, pow, tor, cN);
	}
	
	public void printVehicle()
	{
		System.out.println("Vehicle Information: ");
		System.out.printf("Seating Capacity: %d \n",seatingCapacity);
		System.out.printf("Tire Size: %f \n", tireSize);
		System.out.printf("Width: %f \n", width);
		System.out.printf("Height: %f \n", height);
		System.out.println("Vehicle Engine Information: ");
		eng.printEngine();
		System.out.print("\n");
	}
	
	
}
