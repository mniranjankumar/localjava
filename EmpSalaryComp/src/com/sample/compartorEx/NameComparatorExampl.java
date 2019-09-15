package com.sample.compartorEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NameComparatorExampl {

	public static void main(String[] args) {
		List authors = new ArrayList<>();
		authors.add(new Author(1, "ji", 40000));
		authors.add(new Author(1, "k", 40000));
		authors.add(new Author(1, "a", 40000));
		authors.add(new Author(1, "z", 40000));
		authors.add(new Author(1, "u", 40000));
		
		System.out.println("before sorting list :"+authors);
		
		Collections.sort(authors, new NameCompartor());
		
		System.out.println(" after sorting list "+authors);
	}

}
