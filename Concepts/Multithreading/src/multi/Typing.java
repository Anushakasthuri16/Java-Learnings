package multi;

public class Typing extends Thread{

	
	public void run()
	{
		
		for(int i=0;i<=5;i++)
		{
			System.out.println("Type the code");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	

}