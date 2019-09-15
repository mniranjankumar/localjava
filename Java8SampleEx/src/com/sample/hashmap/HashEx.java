package com.sample.hashmap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashEx {

	public static void main(String[] args) {
		Map<String, Integer> mapentries = new HashMap<>();
		mapentries.put("zero", 0);
		mapentries.put("two", 2);
		mapentries.put("three", 3);
		mapentries.put("one", 1);
		
		for(Iterator itr = mapentries.entrySet().iterator(); itr.hasNext(); ){
			
		}
		
	}

}
