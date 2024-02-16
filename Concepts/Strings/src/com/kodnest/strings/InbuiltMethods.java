package com.kodnest.strings;

import java.util.Scanner;

public class InbuiltMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Raja Ram Mohan Roy Ram";
		System.out.println(str);
		System.out.println("==============================");
		System.out.println(str.length());
		
		System.out.println("==============================");
		System.out.println(str.trim());							//remove the spaces at start and end of the string
				
		System.out.println("==============================");
		System.out.println(str.replace("Roy","Rao"));			
		
		System.out.println("==============================");
		System.out.println(str.replaceAll("Raja Ram", "Rani Raja"));
		
		System.out.println("==============================");
		System.out.println(str.toCharArray());
		
		System.out.println("==============================");
		System.out.println(str.startsWith("Raja"));
		
		System.out.println("==============================");
		System.out.println(str.endsWith("Kasthuri"));
		
		System.out.println("==============================");
		System.out.println(str.concat(" pAnusha"));
		
		System.out.println("==============================");
		System.out.println(str.charAt(6));         
		
		System.out.println("==============================");
		System.out.println(str.indexOf("Roy"));   				//roy is at which index
		
		System.out.println("==============================");
		System.out.println(str.indexOf("Ram", 13));  			//where is ram after index 13 
		

		System.out.println("==============================");
		System.out.println(str.codePointAt(1));   				//Ascii value of index at 1(a) is 97
		

		System.out.println("==============================");
		System.out.println(str.codePointCount(6, 13));  		//How many character in between 6-13
		

		System.out.println("==============================");
		System.out.println(str.codePointBefore(11)); 			//11-h-  111 in ascii value
		
		System.out.println("==============================");
		System.out.println(str.contains("Anu"));				//the string contains "Anu" or not   --->false
		
		String str1="Raja Ram Mohan Roy Ram";
		System.out.println("==============================");
		System.out.println(str.contentEquals(str1)); 			 //if both strings sequence is same then true else false
		
		System.out.println("==============================");
		System.out.println(str.hashCode());
		
		String str2=" ";
		System.out.println("==============================");
		System.out.println(str2.isBlank());   					//space is not considered here
		
		System.out.println("==============================");
		System.out.println(str2.isEmpty());						//It consider spaces also
		
		System.out.println("==============================");
		System.out.println(str.translateEscapes());
		
		System.out.println("==============================");
		System.out.println(str.intern());
		
		System.out.println("==============================");
		System.out.println(str.lastIndexOf("Roy"));
		
		
		System.out.println("==============================");
		System.out.println(str.getClass());
		
		
		System.out.println("==============================");
		Scanner scan=new Scanner(System.in);
		System.out.println(scan.getClass());
		
		System.out.println("==============================");
		System.out.println(str.repeat(4));
		
		String str3="raja ram mohan roy ram";
		System.out.println("==============================");
		System.out.println(str.equalsIgnoreCase(str3));  		//ignore upper and lower and compare both strings
		
		
		
		
	}

}
