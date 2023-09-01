package methods;

import java.util.Scanner;

public class NestedSimpleIF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are from XYZ Company,and this position is only for Women "
				+ "who has good knowlegde in java, Experience is in between 0-2 years");
		Scanner scan = new Scanner(System.in);
		System.out.println("Are you female,Enter true or false");
		boolean Gender=scan.nextBoolean();
		if (Gender==true)
		{
			System.out.println("Continue to Apply for this position ");
			System.out.println("================================================================");
			System.out.println("Enter your Experience: ");
			int Experience=scan.nextInt();
			if (Experience<=2)
			{
				System.out.println("Your profile is based on our criteria.Fill Your Education Details...");
			}
		}
	}

}
