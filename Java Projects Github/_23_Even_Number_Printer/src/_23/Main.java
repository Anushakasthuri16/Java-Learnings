package _23;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter number: ");
		int n = scan.nextInt();
		printEvennumbers(n);
	}
	

	public static void printEvennumbers(int n) {
		// TODO Auto-generated method stub
		
		
	int i=1;
	while(i<=n)
	{

	if (i%2==0)
	{
		System.out.print(i+ " ");
	}
	i++;
}}}
