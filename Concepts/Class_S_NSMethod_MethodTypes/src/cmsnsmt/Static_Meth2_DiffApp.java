package cmsnsmt;

import java.util.Scanner;

public class Static_Meth2_DiffApp {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Enter radius: ");
			Scanner scan=new Scanner(System.in);
			double r=scan.nextDouble();
			
			System.out.println(Static_Meth2_Diff.AreaOfCircle(r));
	}

}
