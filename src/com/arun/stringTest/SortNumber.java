package com.arun.stringTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortNumber {

//	private static List<Integer> collect;
//	private static List<Integer> collect2;

	public static void main(String[] args) {
		Integer arr[] = { 12, 34, 67, 454, 3, 1, 23, 14 };

		/*
		 * List<Integer> list = Arrays.asList(arr);
		 * 
		 * 
		 * 
		 * List<Integer>l=list.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(
		 * Collectors.toList()); System.out.println(l);
		 */
		
		
		/*
		 * Arrays.sort(arr); System.out.println(arr[arr.length-1]);
		 */
		
		String str="aRuN ";
		String res="";
		/*
		 * String res="";
		 * 
		 * for(int i=0;i<str.length();i++) {
		 * 
		 * 
		 * if(Character.isUpperCase(str.charAt(i))) { res=
		 * res+Character.toLowerCase(str.charAt(i));
		 * 
		 * } else { res= res+Character.toUpperCase(str.charAt(i)); }
		 * 
		 * } System.out.println(res);
		 */
		for(int i=0;i<str.length();i++)
		{
			
			char ch= str.charAt(i);
			res= ch+res;
		}
		
		System.out.println(res);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		 * collect = list.stream().sorted().collect(Collectors.toList());
		 * 
		 * System.out.println(collect); Arrays.sort(arr);
		 * 
		 * System.out.println(arr[arr.length-2]);
		 */

		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Integer> collect2= list.stream().sorted((i1,i2)->i1.compareTo(i2)).collect(Collectors.toList());
//		System.out.println(collect2);
	}

}
