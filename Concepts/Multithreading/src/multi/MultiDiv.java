package multi;

import java.util.Scanner;

public class MultiDiv extends Thread{
	int a1;
	int b1;
	public MultiDiv(int a, int b) {
		this.a1=a;
		this.b1=b;
		
	}

	
	public void run()
	
	{	
		
		if(getName().equals("Mul"))
		{
						multiply(a1,b1);
		}
		else
		{
						division(a1,b1);
		}
	}
	
	public void multiply(int a,int b)
	{	
		try
		{
			
		int c=a*b;
		System.out.println("Multiplication of two numbers is "+c);
		Thread.sleep(3000);
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
	public void division(int a,int b)
	{	
		try
		{
		int c=a/b;
		System.out.println("Division of two numbers is "+c);
		Thread.sleep(3000);
		
	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

}
}
