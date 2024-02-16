package multi;

public class InstagramApp {
	public static void main(String []args)
	{
		try
		{
			System.out.println("instagram opened");
			Chattingg t=new Chattingg();
			Reels r=new Reels();
			t.start();
			r.start();
			t.join();
			r.join();
			System.out.println("Instagram closed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
