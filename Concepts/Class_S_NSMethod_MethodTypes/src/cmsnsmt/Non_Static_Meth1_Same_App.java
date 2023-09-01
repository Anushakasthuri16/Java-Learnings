package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth1_Same_App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Non_Static_Meth1_Same_App nsm =new Non_Static_Meth1_Same_App();
		nsm.AreaOfCircle();
		
	}
	public void AreaOfCircle()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=scan.nextDouble();
		System.out.println(2*3.141*(r*r));
	}
}
