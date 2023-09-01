package _17_Multiple_Of_Ten_Checker;

import java.util.Scanner;

public class MultipleTenChecker {
	public class Main {
		public static void checkMultipleOfTen(int n)
		{
			if (n%10==0)
			{
				System.out.println("The number is a multiple of 10");
			}
			else
			{
				System.out.println("Not a multiple of 10");
			}
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter number: ");
int n = scan.nextInt();
checkMultipleOfTen(n);
	}
	}
}
