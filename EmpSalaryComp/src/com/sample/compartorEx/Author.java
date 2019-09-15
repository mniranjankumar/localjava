package com.sample.compartorEx;

public class Author {
	private int id;
	private String name;
	private long salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(int id, String name, long salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	
}
