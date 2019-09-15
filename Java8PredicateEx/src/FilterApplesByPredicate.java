import java.util.Arrays;
import java.util.List;



public class FilterApplesByPredicate {

	public static void main(String[] args) {
		List<Apple> apples = Arrays.asList(new Apple("blue", 130), new Apple("yellow", 50), new Apple("red", 150), new Apple("green", 160));
		
		ApplePredicates.filterApples(apples, ApplePredicates.isWeightMoreOrEqual150()).forEach(System.out::print);
	}
	
}
