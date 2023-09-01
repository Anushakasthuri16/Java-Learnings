package practice;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		AreaCircle();		
	}
public static void AreaCircle()
{
	System.out.println("Enter radius: ");
	Scanner scan= new Scanner(System.in);
	Double r=scan.nextDouble();
	
	double d = 2*3.141*(r*r);
	System.out.println(d);
	
}
}
