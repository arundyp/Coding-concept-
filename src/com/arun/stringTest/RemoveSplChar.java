package com.arun.stringTest;

public class RemoveSplChar {
	public static void main(String[] args) {
		String str="abc@#$";
		String remSpl="";
		String spl="";
		
		for(int i=0;i<str.length();i++)
		{
			if(!Character.isAlphabetic(str.charAt(i))&& !Character.isDigit(str.charAt(i)) 
					&&!Character.isWhitespace(str.charAt(i)))
			{
				spl=spl+str.charAt(i);
			}
			else
			{
				remSpl=remSpl+str.charAt(i);
			}
		}
		System.out.println(spl);
	}

}
