package com.sample.funtion;

public class ExampleOfFunctionalInterfac implements ExOfFunctInter{

	public static void main(String[] args) {
		int x =1,y=2,z=3;
		ExampleOfFunctionalInterfac ref = new ExampleOfFunctionalInterfac();
		System.out.println( "add "+ref.add(y, x));
		System.out.println( "sub "+ref.sub(z, y, x));
		System.out.println( "mul "+ref.mul(x, y, z));
		System.out.println("div "+ExOfFunctInter.div(y, x));
	}

	@Override
	public int add(int a, int b) {
		return a+b;
		
	}

}
