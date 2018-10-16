package e2;

import e2.NewEnergyVehicle;

public class PureElectricVehicle extends NewEnergyVehicle
{
	private double maximumRange;
	
	public PureElectricVehicle() 
	{
		super();
		maximumRange = 0;
	}
	
	public PureElectricVehicle(int sC, double tS, double len, double wid, double hei, 
			double dC, double pow, double tor, int cN, double bC, double mR) 
	{
		super(sC, tS, len, wid, hei, dC, pow, tor, cN, bC);
		maximumRange = mR;
	}
	
	public void printPureElectricVehicle() 
	{
		System.out.println("Pure Electric Vehicle Information: ");
		System.out.println("Maximmum Range Information: ");
		System.out.printf("Maximum Range: %f \n", maximumRange);
		super.printNewEnergyVehicle();
	}
}
