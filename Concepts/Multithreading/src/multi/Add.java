package multi;

import java.util.Scanner;

public class Add extends Thread{
	
	int a1;
	int b1;
	public Add(int a, int b) {
		this.a1=a;
		this.b1=b;
		
	}

	public void run()
	{	
		try
		{	

		int c=a1+b1;
		System.out.println("Addition of two numbers is "+c);
		Thread.sleep(3000);
		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
