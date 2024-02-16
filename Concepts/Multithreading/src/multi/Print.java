package multi;

public class Print implements Runnable{
	public void run()
	{
		if(Thread.currentThread().getName().equals("Number"))
		{
			numPrint();
		}
		else
		{
			charPrint();
		}
	}
	public void charPrint()
	{
		for(char c='A';c<='E';c++)
		{
			System.out.println(c);
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public void numPrint()
	{
		for(int c=1;c<=5;c++)
		{
			System.out.println(c);
			try
			{
				Thread.sleep(3000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

}
