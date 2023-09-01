package _14_MethodOverloadingCalculator;

public class Calculator {
	public static double calculate(double first,double second)
	{
		return first+second;
	}

	public static int calculate(double first,double second,String op)
	{
		return first-second;
	}
	public static int calculate(double first,String op,double second)
	{
		return first*second;
	}
	public static int calculate(String op,double first,double second)
	{
	
		 return first/second;
	}


}
