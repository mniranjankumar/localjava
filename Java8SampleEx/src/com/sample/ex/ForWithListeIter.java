package com.sample.ex;

import java.util.ArrayList;
import java.util.List;

public class ForWithListeIter {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("hi");
		names.add("kkk");
		names.add("ood");
		names.forEach(name->System.out.println(name));
		
	}

}
