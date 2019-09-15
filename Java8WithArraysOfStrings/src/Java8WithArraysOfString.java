import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8WithArraysOfString {

	public static void main(String[] args) {
		List<Person> staff = Arrays.asList(new Person("x", 27, new BigDecimal(20000)),
				new Person("y",30, new BigDecimal(40000)),
				new Person("z",32,new BigDecimal(50000)));	
		
		List<String> names = staff.stream().map(x->x.getName()).collect(Collectors.toList());
		System.out.println(names);
	}

}
