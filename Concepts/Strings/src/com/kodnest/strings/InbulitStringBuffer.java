package com.kodnest.strings;

public class InbulitStringBuffer {

	public static void main(String[] args) 
	{

		StringBuffer sb=new StringBuffer("Anusha Kasthuri");
		
		System.out.println("==============================");
		System.out.println(sb.append(" A"));
		
		System.out.println("==============================");
		System.out.println(sb.deleteCharAt(7));
		
		System.out.println("==============================");
		System.out.println(sb.insert(8, "Chow"));
		
		System.out.println("==============================");
		System.out.println(sb.reverse());
		
		System.out.println("==============================");	
		System.out.println(sb.capacity());
		
		System.out.println("==============================");	
		System.out.println(sb.length());
		
		System.out.println("==============================");	
		System.out.println(sb.substring(6));
		
		System.out.println("==============================");
		System.out.println(sb.deleteCharAt(6));
	}

}
