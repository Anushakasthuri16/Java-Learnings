package _17_Age_Categorizer;

import java.util.Scanner;

public class Main {


		
		// TODO Auto-generated method stub
	public static void categorizeAge(int age)

		{
			if (age>0 && age<=12)
			{
			System.out.println("child");	
			}
			else if(age>=13 && age<=19)
			{
				System.out.println("teen");
			}
			else if(age>=20 && age<=59)
			{
				System.out.println("adult");
				
			}
			else
			{
				System.out.println("Senior");
			}
		}

		public static void main(String[] args)

		{
Scanner scan=new Scanner(System.in);

int age=scan.nextInt();
categorizeAge(age);


		}

	}


