package com.inheritance.testing;

public class Student extends Teacher{
	long marks;
	
	public long getMarks() {
		return marks;
	}

	public void setMarks(long marks) {
		this.marks = marks;
	}
	
	void show(){
		super.show();
		System.out.println("sub class");
	}
}
