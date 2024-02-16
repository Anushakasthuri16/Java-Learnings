package limitexceed;

import java.util.Scanner;

public class AtmApp {
	
		static final int limit=20000;
		public static void main(String[] args) 
		{
			
			try
			{
				amount(limit);
			}
			catch(Exception e)
			{
				e.printStackTrace();
				
			}
		}
		public static void amount(int limit) throws Exception
		{
			
			int withdraw=0;
				while(withdraw<=limit)
				{
					Scanner scan=new Scanner(System.in);
					System.out.println("Enter amount: ");
					int amount=scan.nextInt();
					int totalWithdrawl=withdraw+amount;
					System.out.println("Total withdrawl amount is "+withdraw);
					if((totalWithdrawl)<=limit)
					{
						System.out.println("Your amount "+amount+" is taken");
					}
					withdraw=withdraw+amount;
				}
				throw new LimitExceed();
		}
	}



