package multi;

public class CharPrinting extends Thread{
	public void run()
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
