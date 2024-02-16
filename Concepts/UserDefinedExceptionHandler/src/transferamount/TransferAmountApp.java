package transferamount;

import java.util.Scanner;

import licence.OverAgeException;
import licence.UnderAgeException;

public class TransferAmountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter amount: ");
		int amount=scan.nextInt();
		try
		{
			amount(amount);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void amount(int amount) throws Exception
	{
		if(amount<=10000)
		{
			System.out.println("Amount Already taken");

		}
		else
		{
			throw new InsufficientFunds();
		}
		
	}
}


