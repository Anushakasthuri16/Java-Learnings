package com.kodnest.strings;

import java.util.Scanner;

public class Append99 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter ");
		Scanner scan=new Scanner(System.in);
		String str=scan.nextLine();
		str=str.replaceAll(" ","99");
		System.out.println(str);
	}

}
