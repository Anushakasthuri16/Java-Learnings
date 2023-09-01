package methods;

public class labeledwhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Start");
		int i=1;
		anu:while(i<=5)
		{
			int j=1;
			anusha:while(j<=5)
			{
				System.out.println("* ");
				j++;
				break anu;
			}
			i++;
			System.out.println();
		}

	}

}
