package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth2_SameApp {

	public static void  main(String[] args) {
	
			System.out.println("Enter radius: ");
			Scanner scan=new Scanner(System.in);
			double r=scan.nextDouble();
			Non_Static_Meth2_SameApp nsms=new  Non_Static_Meth2_SameApp();
			System.out.println(nsms.AreaOfCircle(r));
	}
	public double AreaOfCircle(double r)
	{
		return 3.141*(r*r);
	}
}
