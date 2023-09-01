package programms;

import java.util.Scanner;

public class Multiplication3
{
	public static void main(String[] args)
	{
		double phi=3.14;
		System.out.println("Enter the  values");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		multilpy(phi,r);
		System.out.println(multilpy(phi,r));
	}
	
	
	private static double multilpy(double phi,int r) 
	{
		
		double area=phi*r*r;
		return area;
	
	}
	}


	


