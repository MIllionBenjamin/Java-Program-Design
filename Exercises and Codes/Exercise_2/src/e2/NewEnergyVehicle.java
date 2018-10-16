package e2;

import e2.Vehicle;

public class NewEnergyVehicle extends Vehicle
{
	private double batteryCapacity;
	
	public NewEnergyVehicle()
	{		
		super();
		batteryCapacity = 0;
	}
	
	public NewEnergyVehicle(int sC, double tS, double len, double wid, double hei, 
			double dC, double pow, double tor, int cN, double bC)
	{
		super(sC, tS, len, wid, hei, dC, pow, tor, cN);
		batteryCapacity = bC;
	}
	
	public void printNewEnergyVehicle()
	{
		System.out.println("New Energy Vehicle Information: ");
		System.out.println("Battery Capacity Information: ");
		System.out.printf("Battery Capacity: %f \n", batteryCapacity);
		super.printVehicle();
		System.out.print("\n");
	}
}
