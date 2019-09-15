package com.sample.funtion;

@FunctionalInterface
public interface ExOfFunctInter {
	 int add(int a, int b);
	 default int sub(int a, int b, int c){
		 return a-b-c;
	 }
	 default int mul(int a, int b, int c){
		 return a*b*c;
	 }
	 static int div(int a, int b){
		return b%a;
		 
	 }
}
