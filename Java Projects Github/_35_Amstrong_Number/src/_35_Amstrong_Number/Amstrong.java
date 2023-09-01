package _35_Amstrong_Number;

public class Amstrong {
	Amstrong a1=new Amstrong();
	int amsnum(int n)
	{
		
		int sum=0;
		while(n>0)
		{
				int ld=n%10;
				int p1=a1.raiseToPowerN(n,sum);
				sum=sum+p1;
				n=n/10;
				
			}
			
		
		return sum;
		
		
		
	
	}
	int raiseToPowerN(int num,int range)

	{
	
	int finalresult=1;

	for(int i=1;i<=range;i++)

	{

	finalresult=finalresult*num;

	}

	return finalresult;
	

}
}
