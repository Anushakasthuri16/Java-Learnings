package cmsnsmt;

import java.util.Scanner;

public class Static_Meth1_Same {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfCircle();

	}
public static void AreaOfCircle()
{
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter radius: ");
	double r=scan.nextDouble();
	System.out.println(3.141*(r*r));
	
}
}
