package com.test.pack;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapForIter {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "x");
		map.put(2, "u");
		map.put(3, "i");
		map.put(4, "z");
		map.put(5, "y");
		
		for (Map.Entry<Integer, String> string : map.entrySet()) {
			System.out.println(string);
		}
	}

}
