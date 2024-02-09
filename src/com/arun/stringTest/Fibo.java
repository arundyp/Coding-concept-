package com.arun.stringTest;

import java.util.Scanner;

public class Fibo {
	public static void main(String[] args) {
		
		int n1=0,n2=1,n3;
		System.out.println("Enter number");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<num;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
		}
	}

}
