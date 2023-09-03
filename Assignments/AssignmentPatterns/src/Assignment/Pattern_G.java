package Assignment;

public class Pattern_G {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if((j==1&&(i>1&&i<n))||((i==n||i==1)&&(j>1 && j<n))||(j==n&&i>n/2)||(i==n/2+1&&j>n/2))
					
				{
				System.out.print("*");
				}
			else
			{
				System.out.print(" ");
			}
				
			}
			System.out.println();
		}
	}

}
