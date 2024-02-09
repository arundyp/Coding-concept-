package com.arun.stringTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ElementPresetInTwoArray {
	
	public static void main(String[] args) {
		Integer arr1[]= {10,12,34,65};
		Integer arr2[]= {10,11,34,68};
		Integer arr3[]= {9,12,36,65};
		
		HashSet<Integer> h = new HashSet<>();
		
		List<Integer> l1= Arrays.asList(arr1);
		List<Integer> l2= Arrays.asList(arr2);
		List<Integer> l3= Arrays.asList(arr3);
		h.addAll(l1);
		h.addAll(l2);
		h.addAll(l3);
		
		List<Integer> finalList= new ArrayList<>();
		
		for(Integer num:h)
		{
			
			if(l1.contains(num)&&l2.contains(num)||l2.contains(num)&&l3.contains(num)||
					l1.contains(num)&&l3.contains(num))
			{
				finalList.add(num);
			}
		}
		
		System.out.println(finalList);
		
	}

}
