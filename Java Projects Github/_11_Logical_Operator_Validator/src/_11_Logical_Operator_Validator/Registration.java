package _11_Logical_Operator_Validator;

public class Registration {
public boolean ValidInput(boolean input,boolean condition)
{
	if (input && condition)
	{
		System.out.println("Input is Valid");
		return true;
	}
	else
	{
		System.out.println("Invalid input");
		return false;
	}
}
}
