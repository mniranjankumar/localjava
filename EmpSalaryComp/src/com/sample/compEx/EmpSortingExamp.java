package com.sample.compEx;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EmpSortingExamp {

	public static void main(String[] args) {
		List emplist = new ArrayList<>();
		emplist.add(new Employee(1, "heloo", 50000));
		emplist.add(new Employee(2, "hi", 80000));
		emplist.add(new Employee(4, "hue", 30000));
		emplist.add(new Employee(3, "oo", 40000));
		
		System.out.println("before employee list "+emplist);
		
		Collections.sort(emplist);
		
		System.out.println("after employee list "+emplist);
	}

}
