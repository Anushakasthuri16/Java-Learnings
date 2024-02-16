package oops;

import java.util.Scanner;

public class ExampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter Array Length");
		Scanner scan=new Scanner(System.in);
		
		Example arr[]=new Example[scan.nextInt()];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter student "+(i+1)+" RollNo, Name, Age");
			arr[i]=new Example(scan.nextInt(),scan.next(),scan.nextInt());
		}
		System.out.println("The student details are: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i].rollNo+" "+arr[i].Name+" "+arr[i].age+" | ");
		}
		}

}
