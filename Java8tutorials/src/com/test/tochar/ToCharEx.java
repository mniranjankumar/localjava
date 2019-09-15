package com.test.tochar;

public class ToCharEx {

	public static void main(String[] args) {
		String password = "passwordui";
		
		/*char[] passwordchar = password.toCharArray();
		for(char x: passwordchar){
			System.out.println(x);
		}*/

		password.chars().mapToObj(x->(char)x).forEach(System.out::println);
	}

}
