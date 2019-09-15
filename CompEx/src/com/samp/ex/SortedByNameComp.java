package com.samp.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortedByNameComp {

	public static void main(String[] args) {
		List<Author> au = new ArrayList<Author>();
		au.add(new Author("x","y",30));
		au.add(new Author("x","x",20));
		au.add(new Author("x","z",23));
		au.add(new Author("e","u",34));
		au.add(new Author("t","t",28));
		
		Collections.sort(au);
		for (Author author : au) {
			System.out.println("The author"+author.getFirstName()+" lastName"+author.getLastName()+" age"+ author.getAge());
		}

	}

}
