package com.sample.debugging;

public class MainEx {

	public static void main(String[] args) {
		DebuggingEx de = new DebuggingEx();
		de.Calcount();
		System.out.println("results of count "+de.getCount());
	}

}
