package _12_Bitwise_Swapper;

import java.util.Scanner;


public class BitwiseSwapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan=new Scanner(System.in);
System.out.println("Enter a and b values: ");
int first = scan.nextInt();
int second = scan.nextInt();
System.out.println("Before Swapping of a and b is "+first+ " and "+second);

BitwiseSwapper bs=new BitwiseSwapper();
bs.swapUsingBitwise(first,second);

}
public void swapUsingBitwise(int first,int second)
{
int temp=0;
temp=first^second;
second=temp^second;
first=temp^second;

System.out.println("After Swapping of a and b is: "+first+ " and "+second);
}

}
