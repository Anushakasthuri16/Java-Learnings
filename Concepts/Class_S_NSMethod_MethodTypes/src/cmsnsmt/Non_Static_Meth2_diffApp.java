package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth2_diffApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		Non_Static_Meth2_diff nsmd=new Non_Static_Meth2_diff();
		System.out.println(nsmd.AreaOfCircle(r));
}
	}


