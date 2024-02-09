package com.arun.stringTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConverListOfArrayToUpperCaseUsingJava8 {
public static void main(String[] args) {
		
		List<String> list = Arrays.asList("abc", "def", "ghi");
		List<String> upped = list.stream().map(String::toUpperCase).collect(Collectors.toList());

		System.out.println(upped);


	}

}
