package transferamount;

public class InsufficientFunds extends Exception{
	public InsufficientFunds()
	{
		super("Your are out of the money limit");
	}

}
