package com.sample;

import java.util.Arrays;
import java.util.List;

public class ForEachLoop {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("xx","yy","zz","aa");
		names.forEach(System.out::println);
	}

}
