package programms;

import java.util.Scanner;

public class multiplication2 {

	public static void main(String[] args)
	{
		double phi=3.14;
		System.out.println("Enter the  values");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		multilpy(phi,r);
		System.out.println();
	}
	
	
	private static void multilpy(double phi,int r) 
	{
		
		double area=phi*r*r;
		System.out.println(area);
	
	}
	}


	