package com.tester;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Testing {

	public static void main(String[] args) {
		List<Developer> listDev = getDevelopers();
		
		listDev.sort((Developer do1, Developer do2)->do1.getAge()-do2.getAge());
		listDev.forEach((developer)->System.out.println(developer));
	}

	private static List<Developer> getDevelopers() {
		List<Developer> results = new ArrayList<>();
		results.add(new Developer("xxx", new BigDecimal(30000), 40));
		results.add(new Developer("yyy", new BigDecimal(40000), 20));
		results.add(new Developer("zzz", new BigDecimal(50000), 30));
		return results;
	}

}
