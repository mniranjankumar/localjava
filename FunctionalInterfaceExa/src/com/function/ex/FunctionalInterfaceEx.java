package com.function.ex;

public class FunctionalInterfaceEx implements FunctionExInter{

	public static void main(String[] args) {
		FunctionalInterfaceEx fie = new FunctionalInterfaceEx();
		fie.say("hello");
	}

	
	public void say(String msg) {
		System.out.println(msg);
		
	}

}
