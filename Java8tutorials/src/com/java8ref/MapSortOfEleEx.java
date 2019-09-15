

import java.util.*;
import java.util.stream.Collectors;

public class MapSortOfEleEx {

	public static void main(String[] args) {
		Map<String, Integer> unsortedMap = new HashMap<>();
		unsortedMap.put("a", 1);
		unsortedMap.put("z", 2);
		unsortedMap.put("e", 23);
		unsortedMap.put("c", 4);	
		
		System.out.println(unsortedMap);
		Map sortedMap = unsortedMap.entrySet().stream().
				sorted(Map.Entry.comparingByKey()).
				collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue)-> oldValue, LinkedHashMap::new));
	}

}
