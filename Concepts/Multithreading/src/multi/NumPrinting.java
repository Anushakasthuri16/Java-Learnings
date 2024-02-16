package multi;

public class NumPrinting extends Thread{

	
		public void run()
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

	

}
