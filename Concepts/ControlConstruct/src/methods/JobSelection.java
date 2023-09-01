package methods;

import java.util.Scanner;

public class JobSelection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Apptitude round is qualified or not Using True or False");
		boolean apti = scan.nextBoolean();
		if (apti==true)
		{
			System.out.println("You are Eligible for Next Round");
			System.out.println("Enter Technical round is qualified or not Using True or False");
			boolean tech=scan.nextBoolean();
			if (tech==true)
			{
			System.out.println("Glad to see you Again.....   You are Entering into the furthur round");	
			}
			else
			{
				System.out.println("Sorry to say..... Will get back to you for the furthur vaccancy");
			}
		}
		else
		{
		System.out.println("Sorry....Thank you for your valuable Spent");		
		}
		}
}
