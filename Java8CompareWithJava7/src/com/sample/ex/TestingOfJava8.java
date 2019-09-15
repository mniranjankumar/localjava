package com.sample.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TestingOfJava8 {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("sa");
		names.add("ha");
		names.add("si");
		names.add("hoo");
		names.add("koo");
		
		List<String> names2 = new ArrayList<>();
		names2.add("sa");
		names2.add("ha");
		names2.add("si");
		names2.add("hoo");
		names2.add("koo");
		
		TestingOfJava8 test = new TestingOfJava8();
		test.testingWithJava7(names);
		test.testingWithJava8(names2);
		System.out.println(names2);
	}

	private void testingWithJava8(List<String> names2) {
		System.out.println("before entering into Java8");
		Collections.sort(names2, (s1,s2)->s1.compareTo(s2));
		System.out.println(names2);
		System.out.println("java 8 sorting names has done.");
	}

	private void testingWithJava7(List<String> names) {
		System.out.println("before entering into java7");
		Collections.sort(names, new Comparator<String>(){

			public int compare(String s1, String s2) {
				
				return s1.compareTo(s2);
			}
		});
		System.out.println(names);
		System.out.println("java 7 sorting has done");
	}

	

}
