package limitexceed;

public class LimitExceed extends Exception{
	public LimitExceed()
	{
		super("Your Day Limit is exceeded, Try again after 24 hours");
	}

}
