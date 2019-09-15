package com.reserve.ex;

public class SafeE {

	public static void main(String[] args) {
		Reserve r = new Reserve(1);
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		
		t1.start();
		t2.start();
	}

}
