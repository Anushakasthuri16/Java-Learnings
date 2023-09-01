package _32_Count_Of_Number;

public class Count {
	public void CountNumber(int n)
	{
		int count=0;
		
		int i=1;
		while(n!=0)
		{
			
			n=n/10;
			count++;
		}
		System.out.println(count);
	}

}
