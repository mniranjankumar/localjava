package com.sample.testfor;

public class PrintedStarsN {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++){
			System.out.println();
			System.out.println(i);
			for (int j = 1; j<=i; j++) {
				System.out.print("*");
			}
		}

	}

}
