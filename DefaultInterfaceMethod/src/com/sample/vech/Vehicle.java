package com.sample.vech;

public interface Vehicle {
	default void print(){
		System.out.println("this is vechile");
	}
}
