package com.stream.pack;

import java.util.stream.Stream;

public class StreamEx1 {

	public static void main(String[] args) {
		String []langs = {"Java", "Spring", "Oracle"};
		Stream it = Stream.of(langs);
		it.forEach(System.out::println);
	}

}
