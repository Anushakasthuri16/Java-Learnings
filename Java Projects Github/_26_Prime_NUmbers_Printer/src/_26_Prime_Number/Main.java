package _26_Prime_Number;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner scan=new Scanner(System.in);
				System.out.println("Enter number: ");
				int n = scan.nextInt();
				printPrimes(n);
	}
public static void printPrimes(int n) {
	for(int i=2;i<=n;i++)
	{
	boolean res=checkPrime(i);
	if (res==true)
	{
		System.out.print(i+ " ");
	}
	
		
	}
}
public static boolean checkPrime(int n)
{
		
	for (int i=2;i<n;i++)
	{
		
		if (n%i==0)
		{
			
			return false;
		}
		
	}
	return true;
	
	
	
}
}

