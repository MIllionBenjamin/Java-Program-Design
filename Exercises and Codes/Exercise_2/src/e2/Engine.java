package e2;

import java.util.*;


public class Engine 
{
	private double dischargeCapacity;
	private double power;
	private double torque;
	private int cylindersNum;
	
	public Engine() 
	{
		dischargeCapacity = 0;
		power = 0;
		torque = 0;
		cylindersNum = 0;
	}
	
	public Engine(double dC, double pow, double tor, int cN) 
	{
		dischargeCapacity = dC;
		power = pow;
		torque = tor;
		cylindersNum = cN;
	}
	
	public void setEngine(double dC, double pow, double tor, int cN) 
	{
		dischargeCapacity = dC;
		power = pow;
		torque = tor;
		cylindersNum = cN;
	}
	
	public void printEngine()
	{
		System.out.println("Engine Information: ");
		System.out.printf("Discharge Capacity: %f \n", dischargeCapacity);
		System.out.printf("Power: %f \n", power);
		System.out.printf("Torgue: %f \n", torque);
		System.out.printf("Cylinder Number: %d \n", cylindersNum);
		System.out.print("\n");
	}
}
