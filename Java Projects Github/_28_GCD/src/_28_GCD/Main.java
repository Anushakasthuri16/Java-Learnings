package _28_GCD;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		findGCD(a,b);
	}
public static void findGCD(int a,int b)
{
	while (b!=0)
	{
		int rem=a%b;
		
		a=b;
		b=rem;
		
	
	}
	System.out.println("GCD is: "+a);
		
		
	
}
}
