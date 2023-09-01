package programms;
import java.util.Scanner;

public class Multiplication 
{
	public static void main(String[] args)
	{
		
	
		multilpy();	
	}
	static void multilpy()
	{
		
	
		double phi=3.14;
		System.out.println("Enter the  values");
		Scanner scan = new Scanner(System.in);
		
		int r = scan.nextInt();
		
		
		double area=phi*r*r;
		System.out.println(area);
	}
}


