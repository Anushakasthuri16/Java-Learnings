package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth3_diffApp {

public static void main(String[] args) {
	

		System.out.println("Enter Radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		Non_Static_Meth3_diff ac=new Non_Static_Meth3_diff();
		ac.AreaOfCircle(r);

	}

}
