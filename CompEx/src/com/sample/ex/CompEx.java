package com.sample.ex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CompEx {

	public static void main(String[] args) {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee(1, "tt", 30000));
		emps.add(new Employee(2, "yy", 50000));
		emps.add(new Employee(3, "gg", 23000));
		emps.add(new Employee(4, "hh", 67000));
		emps.add(new Employee(5, "ww", 80000));
		emps.add(new Employee(6, "aa", 35000));
		/*Collections.sort(emps, new NameCompartor() {
			
			@Override
			public int compare(Employee o1, Employee o2) {
				
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		for (Employee employee : emps) {
			System.out.println(employee.getName()+", "+employee.getId());
		}*/
		
		EmployeePredicate.filterBySalary(emps, EmployeePredicate.moreThenExceptedAmount()).forEach(System.out::print);;
		
	}

	
}
