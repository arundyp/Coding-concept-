package com.intr;

public class Rev {
	public static void main(String[] args) {
		
		String str="Radar";
		str=str.toLowerCase();
		String rev="";
		for(int i=0;i<str.length();i++)
		{
			rev= str.charAt(i)+rev;
					}
		
		System.out.println(rev);
		
		if(rev.equals(str))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not");
		}
	}
	

}
