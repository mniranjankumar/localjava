package com.inheritance.testing;

public class InhertanceEx {

	public static void main(String[] args) {
		Student s = new Student();
		s.setName("hi");
		s.setMarks(99);
		s.setId(1);
		s.show();
		
		Teacher t = new Teacher();
		t.setId(1);
		t.setName("hello");
		
		System.out.println(t.getName()+" teacher "+t.getId());
		System.out.println(s.getName()+" student "+s.getId());
	}

}
