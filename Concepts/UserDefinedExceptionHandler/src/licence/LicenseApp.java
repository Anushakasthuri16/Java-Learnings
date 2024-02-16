package licence;

import java.util.Scanner;

public class LicenseApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter age: ");
		int age=scan.nextInt();
		try
		{
			license(age);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void license(int age) throws Exception
	{
		if(age<18)
		{
			throw new UnderAgeException();
		}
		else if(age>65)
		{
			throw new OverAgeException();
		}
		else
		{
			System.out.println("License is Generated");
		}
	}
}


