package _14_Method_Overloading_Calculator;

import java.util.Scanner;

public class MethOverLoadingCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan= new Scanner(System.in);
		System.out.println("Enter first value: ");
		int a=scan.nextInt();
		System.out.println("Enter Operator: ");
		String op=scan.next();
		System.out.println("Enter second value: ");
		int b=scan.nextInt();
		

	}


		public static int calculate(int a,int b)
		{
			return a+b;
		}
	



}

