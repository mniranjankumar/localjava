package com.forEaLoop.ex;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StremOfNull {

	public static void main(String[] args) {
		Stream<String> language = Stream.of("h","i","j",null,"o","a", null, null);
		List<String> languages = language.filter(x->x!=null).collect(Collectors.toList());
		languages.forEach(System.out::println);
	}

}
