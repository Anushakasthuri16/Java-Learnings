package multi;

import java.util.Scanner;

public class SimpleCalculator {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a value : ");
			int a=scan.nextInt();
			System.out.println("Enter b value : ");
			int b=scan.nextInt();

		

		
			Add ad=new Add(a,b);
			ad.start();
			
			Sub s=new Sub(a,b);
			Thread t1=new Thread(s);
			t1.start();
			
			MultiDiv md1=new MultiDiv(a,b);
			md1.setName("Mul");
			md1.start();
			
			MultiDiv md2=new MultiDiv(a,b);
			md2.setName("Div");
			md2.start();
		}	
	}


