package multi;

public class Reels extends Thread{
	public void run()
	{
	
	
		
		try {
			System.out.println("Reel created");
			Thread.sleep(3000);

			System.out.println("Reel is Uploading");
			Thread.sleep(3000);
			
			System.out.println("Reel posted ");
			Thread.sleep(3000);

		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	

}


}
