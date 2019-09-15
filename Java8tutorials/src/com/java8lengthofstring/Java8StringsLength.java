package com.java8lengthofstring;

import java.util.Arrays;
import java.util.List;

public class Java8StringsLength {

	public static void main(String[] args) {
		List<String> colors = Arrays.asList("yellow","green","blue","while","orange","cyan");
		colors.stream().map(x->x.length()).forEach(System.out::println);
	}

}
