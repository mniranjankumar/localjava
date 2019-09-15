package com.sample.compartorEx;

import java.util.Comparator;

public class NameCompartor implements Comparator<Author> {

	@Override
	public int compare(Author a1, Author a2) {
		
		return a1.getName().compareTo(a2.getName());
	}

}
