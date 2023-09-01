package practice;

import java.util.Scanner;

public class SurfaceAreaOfCylinder {
	public static void main(String[] args) {
		
	System.out.println(SurfareaofCylinder());	
	
	}
	public static double SurfareaofCylinder()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius and height: ");
		double r=scan.nextDouble();
		double h=scan.nextDouble();
		return (2*3.141)*r*(r+h);
	}

}
