package methods;

public class dowhilelabeledloop2 {
public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		
		kasthuri:do
		{
			int j=1;
			
			do
			{
				
				System.out.print(j +"  ");
				if ( j==4 )
				{
				System.out.print("@ ");
				break kasthuri;
				}
				j++;		
			}while(j<=4);
		}while(i<=5);
		}
	}
	


