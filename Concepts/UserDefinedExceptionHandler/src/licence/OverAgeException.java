package licence;

public class OverAgeException extends Exception
{
	public OverAgeException()
	{
		super("You are too old, Take Rest");
	}

}
