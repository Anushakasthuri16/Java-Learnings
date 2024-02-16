package multi;

public class Chattingg extends Thread{
	
	public void run()
	{
		
	
			
			try {
				System.out.println("Msg is typing");
				Thread.sleep(3000);
				System.out.println("Msg sent");
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}

}
