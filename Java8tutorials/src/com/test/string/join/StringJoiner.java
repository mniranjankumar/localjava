package com.test.string.join;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoiner {

	public static void main(String[] args) {
		/*String sj = String.join("/", "2019", "03", "17");
		System.out.println(sj);*/
		
		/*List<String> list = Arrays.asList("a","b","b","f");
		String sj = String.join("*", list);
		System.out.println(sj);*/
		
		List<String> names = Arrays.asList("a","v","b","n","m");
		String result = names.stream().map(x->x).collect(Collectors.joining("|")); 
		System.out.println(result);
		
	}

}
