package _15_Method_Overloading_Calculator;

public class Calculator_ {
	public class calculator {
		public static int calculate(int first,int second)
		{
			return first+second;
		}

		public static int calculate(int first,int second,String op)
		{
			return first-second;
		}
		public static int calculate(int first,String op,int second)
		{
			return first*second;
		}
		public static int calculate(String op,int first,int second)
		{
		
			 return first/second;
		}
		
	}

}
