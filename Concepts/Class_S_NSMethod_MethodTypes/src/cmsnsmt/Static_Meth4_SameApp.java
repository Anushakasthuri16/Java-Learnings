package cmsnsmt;

import java.util.Scanner;

public class Static_Meth4_SameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		System.out.println(AreaOfCircle(r));
		

	}
public  static double AreaOfCircle(double r) 
{
return 3.141*(r*r);
}

}
