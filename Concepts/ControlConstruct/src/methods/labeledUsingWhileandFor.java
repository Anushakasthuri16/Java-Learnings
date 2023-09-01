package methods;

public class labeledUsingWhileandFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		
		anu:for(int i=1;i<=5;i++)
		{
			int j=1;
			anusha:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break anu;
			}
			
			System.out.println();
	}

}}
