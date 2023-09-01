package programms;

import java.util.Scanner;

public class Multiplication1 {

	public static void main(String[] args) 
	{
		double res=multilpy();	
		System.out.println(res);
	}
	
	
	static double multilpy()
	{
		double phi=3.14;
		System.out.println("Enter the  values");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		
       double area=phi*r*r;
		return area;
	}
}
