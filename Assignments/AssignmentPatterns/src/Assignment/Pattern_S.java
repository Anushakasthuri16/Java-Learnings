package Assignment;

public class Pattern_S {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		for (int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			if(((i==n||i==1 || i==n/2+1)&&(j>1 && j<n))|| 
					(j==1 && (i>1 && i<=n/2))||
					(j==n &&(i>n/2+1 && i<n)))
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
