package multi;

public class Printtt extends Thread{
	public void run()
	{
		if(getName().equals("Num"))
		{
			numPrint();
		}
		else
		{
			charPrint();
		}
	}
	public void numPrint()
	{
		System.out.println("Number Printing is Started");
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Number printing Ended");
	}
	
	public void charPrint()
	{
		System.out.println("Char Printing is Started");
		for(char i='A';i<='F';i++)
		{
			System.out.println(i);
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("Char Printing Ended");
	}




}
