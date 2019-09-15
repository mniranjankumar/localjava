package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class mapWithFilter {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "something");
		map.put(2, "xxx");
		map.put(3, "kkk");
		
		String result = map.entrySet().stream()
						.filter(x-> "something".equals(x.getValue()))
						.map(x->x.getValue())
						.collect(Collectors.joining());
		System.out.println(result);
		
		Map<Integer, String> samplereuslt = map.entrySet().stream()
											.filter(x->x.getKey() == 2)
											.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
		System.out.println(samplereuslt);
	}

}
