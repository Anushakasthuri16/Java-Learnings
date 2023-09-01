package cmsnsmt;

import java.util.Scanner;

public class Non_Static_Meth3_SameApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter Radius: ");
		Scanner scan=new Scanner(System.in);
		double r=scan.nextDouble();
		Non_Static_Meth3_SameApp ac=new Non_Static_Meth3_SameApp();
		ac.AreaOfCircle(r);
		

	}
public void AreaOfCircle(double r) 
{
System.out.println(3.141*(r*r));
}

}
