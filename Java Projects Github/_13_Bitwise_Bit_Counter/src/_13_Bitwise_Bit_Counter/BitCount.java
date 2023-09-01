package _13_Bitwise_Bit_Counter;

public class BitCount {
	public static int count(int a)
	{
		int count=0;
		while (a>0)
		
		{
			a =a&(a-1);
		count++;	
		}
		return count;
	}

}
