package producerConsumer;

public class Factory {
	int x;
	boolean status =false;
	synchronized public void put(int a)
	{
		try 
		{
			
			if(status==false)
			{
				x=a;
				System.out.println("The value stored in producer thread is "+x);
				status=true;
				notify();
			}
			else
			{
				wait();
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	synchronized public void get()
	{
		try 
		{
	
			if(status==true)
			{
			
				System.out.println("The value in consumer thread is "+x);
				status=false;
				notify();
			}
			else
			{
				wait();
			}
		} 
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}


}
