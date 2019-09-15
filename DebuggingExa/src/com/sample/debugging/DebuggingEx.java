package com.sample.debugging;

public class DebuggingEx {
	private int count = 1;

	public int getCount() {
		return count;
	}
	public void Calcount(){
		for (int i = 0; i < 10; i++) {
			count +=1;
		}
	}
}
