package _24;

import java.util.Scanner;

public class SumOfNaturalNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		CalculatorSum(n);
	}
public static void CalculatorSum(int n)
{
	int sum=0;
	for (int i=1;i<=n;i++)
	{
		
		sum+=i;
	
		
	}
	System.out.println("sum of first" +n+ "natural numbers: "+sum);
}
}
