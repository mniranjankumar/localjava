package com.sample.pack;

public final class SystRelClass {
	
	public static PrinExClass out;
	public static void main(String args[]){
		System.out.println("main method started");
		out.printExMethod();
		SystRelClass sy = new SystRelClass();
		System.out.println(sy);
	}
	
}
