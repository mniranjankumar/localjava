package com.java8.methodreference.conversion;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MethodReferenceToEmp {

	public static void main(String[] args) {
		MethodReferenceToEmp mrpersontoemp = new MethodReferenceToEmp();
		
		List<Person> personslist = new ArrayList<Person>();
		personslist.add(new Person("person1"));
		personslist.add(new Person("person2"));
		personslist.add(new Person("person3"));
		personslist.add(new Person("person4"));
		
		mrpersontoemp.toConvertToEmp(personslist);
		mrpersontoemp.toConvertWithRefEmp(personslist);
		
	}

	private void toConvertWithRefEmp(List<Person> personslist) {
		personslist.stream().map(this::recruit).collect(Collectors.toList()).forEach(System.out::println);
	}

	private void toConvertToEmp(List<Person> personslist) {
		personslist.stream().map(person -> this.recruit(person)).collect(Collectors.toList()).forEach(s->System.out.println(s));
		
	}
	
	

	private Employee recruit(Person person) {
		Employee emp = new Employee(person.getName());
		return emp;
	}

}
