package _1_Galactic_Arithmetic;

import java.util.Scanner;

public class GalacticArithmetic {

	
		// TODO Auto-generated method stub
		public static void main(String[] args) {

			Scanner scan=new Scanner(System.in);

			System.out.println("Enter 2 numbers ");

			long num1=scan.nextLong();

			long num2=scan.nextLong();

			System.out.println("Addition of num1 & num2 is: "+galacticAddition(num1, num2));

			}

			public static long galacticAddition(long num1, long num2){

			return num1+num2;
	}
	

}
