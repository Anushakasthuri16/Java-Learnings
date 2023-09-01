package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth4_diffApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		Non_Static_Meth4_diff nsms=new Non_Static_Meth4_diff();
		System.out.println(nsms.AreaOfCircle(r));

	}

}
