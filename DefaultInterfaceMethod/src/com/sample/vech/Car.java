package com.sample.vech;

public class Car implements Vehicle, FourWheeler{

	public static void main(String[] args) {
		
		System.out.println("inside main method");
	}

	
	public void print() {
		System.out.println("this is car implementation");
		Vehicle.super.print();
		
	}

}
