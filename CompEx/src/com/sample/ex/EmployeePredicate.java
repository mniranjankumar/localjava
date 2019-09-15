package com.sample.ex;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeePredicate {

	public static Predicate<Employee> moreThenExceptedAmount() {
		
		return employee->employee.getSalary() >=30000;
	}

	public static List<Employee> filterBySalary(List<Employee> emps, Predicate<Employee> moreThenExceptedAmount) {
		
		return emps.stream().filter(moreThenExceptedAmount).collect(Collectors.toList());
	}

}
