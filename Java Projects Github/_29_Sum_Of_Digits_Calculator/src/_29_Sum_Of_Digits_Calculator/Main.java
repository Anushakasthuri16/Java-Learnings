package _29_Sum_Of_Digits_Calculator;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		calculateSumOfDigits(n);
		
	}
	public static void calculateSumOfDigits(int n)

	{
		int sum=0;
		while(n>0)
		{
			int rem=n%10;  //123
			sum=sum+rem;
			n=n/10;
		}
	
	
		System.out.println(sum);
	

	}
}
