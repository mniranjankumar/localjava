package com.sample.ex;

public class MultiConstructorExam {

	public static void main(String[] args) {
		MultiConstructorExam mce = new MultiConstructorExam();
		mce.multiConstructorCalls(5, 6);

	}

	private void multiConstructorCalls(int i, int j) {
		this.multiConstructorCall2(i,j, 6);
		
	}

	private void multiConstructorCall2(int i, int j, int k) {
		this.multiConstructorCall3(i, j, k, 9);
		
	}

	private void multiConstructorCall3(int i, int j, int k, int l) {
		System.out.println(i+j+k+l);
		
	}

}
