package com.java8ref;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class MethodReferenceEx {

	public static void main(String[] args) {
		/*List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
		list.forEach(System.out::println);*/
		List<Integer> names = new ArrayList(1);
		
		//names.forEach(System.out::println);
		names.stream().forEach(System.out::println);
	}

}
