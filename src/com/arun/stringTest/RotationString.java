package com.arun.stringTest;

public class RotationString {
	public static void main(String[] args) {
		
		String str1="ABCD";
		String str2="CDAB";
		//ABCDABCD
		
		if(isRotation(str1,str2))
		{
			System.out.println("yes");
		}
		else
		{
			System.out.println("no");
		}
	}
	
	
	public static boolean isRotation(String str1,String str2)
	{
		
		 return str1.length()==str2.length()&&(str1+str1).indexOf(str2)!=-1;
		
		
	}

}
