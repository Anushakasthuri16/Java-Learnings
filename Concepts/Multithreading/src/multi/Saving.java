package multi;

public class Saving extends Thread{

	
	public void run()
	{
		
		for(;;)
		{
			System.out.println("code is saved");
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
