package e2;

import e2.Vehicle;
import e2.NewEnergyVehicle;
import e2.PureElectricVehicle;

public class question3 
{
	public static void main(String[] args) 
	{
		Vehicle veh = new Vehicle(6, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6);
		NewEnergyVehicle nev = new NewEnergyVehicle(6, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6, 6.0);
		PureElectricVehicle pev = new PureElectricVehicle(6, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6.0, 6, 6.0, 6.0);
		veh.printVehicle();
		nev.printNewEnergyVehicle();
		pev.printPureElectricVehicle();
	}
}
