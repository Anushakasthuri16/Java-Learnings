package Assignment;

public class Pattern_Y {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i=1;i<=6;i++)
		{
			for(int j=1;j<=7;j++)
			{
			if((j==4&&i>=4)||(i+j==8||i-j==0)&&(i<=4))
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
