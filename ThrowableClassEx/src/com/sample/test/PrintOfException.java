package com.sample.test;

public class PrintOfException {

	public static void main(String[] args) {
		int k, i=10, j=2;
		try{
			
			k =i/j;
			System.out.println("trt block");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("catch block");
		}

	}

}
