package com.method.ref;

public class MethodReferenceExWithNonStatic {
	public void sayNonStatic(){
		System.out.println("calling sayNonStatic method");
	}
	public static void main(String[] args) {
		Thread t = new Thread(new MethodReferenceExWithNonStatic()::sayNonStatic);
		t.start();
	}

}
