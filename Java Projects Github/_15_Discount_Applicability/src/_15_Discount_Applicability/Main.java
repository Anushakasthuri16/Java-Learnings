package _15_Discount_Applicability;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter purchase amount:");
		Scanner scan=new Scanner(System.in);
		double purchaseAmount=scan.nextInt();
		checkDiscount(purchaseAmount);

	}
	public static void checkDiscount(double purchaseAmount)
	{
	if (purchaseAmount>=100)
	{
		System.out.println("Discount Applicable");
	}
	else
	{
		System.out.println("Purchase must be more than 100$");
	}
	}
}
