package com.constru.pack;

public class ConstruEx {

	public ConstruEx(int i) {
		super();
		// TODO Auto-generated constructor stub
	}

	public int ConstruEx(int i) {
		return i;
	}

	public static void main(String[] args) {
		int x =10, y=10;
		ConstruEx ex = new ConstruEx(x+y);
		System.out.println(ex.toString());
	}

}
