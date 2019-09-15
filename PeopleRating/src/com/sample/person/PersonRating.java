package com.sample.person;

import java.util.Arrays;
import java.util.List;

public class PersonRating {

	public static void main(String[] args) {
		List<People> people = Arrays.asList(new People("hello", 4), new People("tt", 5), new People("jj",3));
		
		PeoplePredicate
		.filterByRating(people, 
				PeoplePredicate.getFilterRating()).
				forEach(System.out::print);
	}

}
