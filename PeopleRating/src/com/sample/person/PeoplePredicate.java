package com.sample.person;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PeoplePredicate {

	public static Predicate<People> getFilterRating() {
		
		return peopleRating->peopleRating.getRating() >=4;
	}

	public static List<People> filterByRating(List<People> people, Predicate<People> peopleRating) {
		// TODO Auto-generated method stub
		return people.stream()
				.filter(peopleRating)
				.collect(Collectors.toList());
	}

}
