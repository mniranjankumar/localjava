package com.java8.method.reference;

import java.util.Arrays;
import java.util.List;

public class MethodReference {

	public static void main(String[] args) {
		List<String> toupperList = Arrays.asList("a1","x1","j1","y1","i1");
		toupperList.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
		System.out.println("Method reference......");
		
		toupperList.stream().map(String::toUpperCase).sorted().forEach(System.out::println);
	}

}
