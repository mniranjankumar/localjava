package com.sample.ex;

import java.util.Comparator;

abstract class NameCompartor implements Comparator<Employee>{

	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub
		return e1.getName().compareTo(e2.getName());
	}

}
