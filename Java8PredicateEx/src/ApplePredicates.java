import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ApplePredicates {

	public static Predicate<Apple> isWeightMoreOrEqual150() {
		
		return apple -> apple.getWeight() >=150;
	}

	public static List<Apple> filterApples(List<Apple> apples, Predicate<Apple> predicate) {
		// TODO Auto-generated method stub
		return apples.stream().filter(predicate).collect(Collectors.toList());
	}
	
}
