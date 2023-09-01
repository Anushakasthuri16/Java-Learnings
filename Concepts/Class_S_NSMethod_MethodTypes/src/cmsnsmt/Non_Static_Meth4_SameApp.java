package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth4_SameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		Non_Static_Meth4_SameApp nsms=new Non_Static_Meth4_SameApp();
		System.out.println(nsms.AreaOfCircle(r));
	}
	public double AreaOfCircle(double r) 
	{
	return 3.141*(r*r);
	}

}
