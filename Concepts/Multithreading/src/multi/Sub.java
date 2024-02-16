package multi;

import java.util.Scanner;

public class Sub implements Runnable{
	int a1;
	int b1;
	public Sub(int a, int b) {
		this.a1=a;
		this.b1=b;
		
	}

	public void run()
	{	
		try
		{
			

		int c=a1-b1;
		System.out.println("Subtraction of two numbers is "+c);
		Thread.sleep(3000);
		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}