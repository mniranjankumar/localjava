package com.special.sort;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapSorting {

	public static void main(String[] args) {
		String[] a = {"1","2","3", "4", "5", "6", "7", "8"};
		List numbers = Arrays.asList(a);
		System.out.println("numbers"+numbers);
		System.out.println();
		
		numbers.stream()
		.map(s->Integer.valueOf((String) s))
		.collect(Collectors.toList());
		
		System.out.println("after modifications"+numbers);
		System.out.println("This is regrading testing");
	}

}
