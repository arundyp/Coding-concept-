package com.arun.stringTest;

public class WordRev {
	public static void main(String[] args) {
		
		String org="java program";
		String word[]=org.split(" ");
		String rev="";
		System.out.println(word.length);
		
		for(int i=0;i<word.length;i++)
		{
			if(i==word.length -i)
			{
				rev= word[i]+rev;
			}
			else
			{
				rev=" "+ word[i]+rev;
			}
		}
		
		System.out.print(rev);
	}

}
