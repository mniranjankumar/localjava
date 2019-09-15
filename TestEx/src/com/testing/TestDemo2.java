package com.testing;

public class TestDemo2 {
	
	int a;
	int b;
	public TestDemo2() {
		this(100);
		System.out.println("this is default constructor");
		a=1;
		b=2;
		System.out.println("value of a "+a);
		System.out.println("value of b "+b);
	}

	public TestDemo2(int x) {
		this(20,10);
		System.out.println("this is one parameterized constructor");
		a=b=x;
		System.out.println("vale of a at one parameterzied constructor"+a);
	}
	
	public TestDemo2(int i, int j) {
		System.out.println("this double parameterized constructor.");
		this.a=i;
		this.b=j;
		System.out.println("value of a= "+this.a);
		System.out.println("value of a= "+this.a);
		System.out.println("value of i"+i);
		System.out.println("value of j"+j);
		
		
	}

	public static void main(String[] args) {
		TestDemo2 td = new TestDemo2();
		System.out.println("Demo2 created at main() method");

	}

}
