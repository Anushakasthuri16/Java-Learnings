package encapsulation;

public class Laptop {
	private int memorySize;
	private String processor;
	
	public Laptop(int memorySize,String processor)
	{
		this.memorySize=memorySize;
		this.processor=processor;
	}
	public int size()
	{
		return memorySize;
	}
	public String processor()
	{
		return processor;
	}

}
