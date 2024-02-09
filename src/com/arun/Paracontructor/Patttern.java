package com.arun.Paracontructor;

public class Patttern {
	
	public static void main(String[] args) {
		
	
		for(int i=1;i<=4;i++)
		{
			int x=1;
			for(int j=1;j<=4;j++)
			{
				
				if(j>=5-i)
				{
					System.out.print(x);
					x++;
				}
				else
				{
					System.out.print("-");
				}
				
			}
			System.out.println(" ");
		}
	}

}
