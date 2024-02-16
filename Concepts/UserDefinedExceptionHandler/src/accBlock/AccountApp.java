package accBlock;

import java.util.Scanner;

public class AccountApp {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int acc=scan.nextInt();	
		try
		{
			blocked(acc);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		

	}
	
	
	public static void blocked(int acc) throws AtmBlocked
	{
		
		for(int i=1;i<=3;i++)
		{
			System.out.println("Wrong Pin");
		}
		throw new AtmBlocked();
		
	}

}
