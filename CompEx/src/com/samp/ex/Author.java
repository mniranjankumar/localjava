package com.samp.ex;

public class Author implements Comparable<Author> {
	private String firstName;
	private String lastName;
	private int age;
	
	
	
	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	@Override
	public String toString() {
		return "Author [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + "]";
	}



	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Author(String firstName, String lastName, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}



	@Override
	public int compareTo(Author au) {
		// TODO Auto-generated method stub
		/*int last = this.lastName.compareTo(au.lastName);
		return last == 0 ? this.firstName.compareTo(au.firstName) : last;*/
		return this.age > au.getAge() ? 1 : this.age < au.getAge() ? -1 :0;
	}

}
