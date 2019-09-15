import java.util.Optional;

public class OptionalEx {

	public static void main(String[] args) {
		Integer value1 = null;
		Integer value2 = new Integer(10);
		
		Optional<Integer> a = Optional.ofNullable(value1);
		Optional<Integer> b = Optional.of(value2);
		
		System.out.println(OptionalEx.sum(a,b));
	}

	private static int sum(Optional<Integer> a, Optional<Integer> b) {
		
		System.out.println("a is present or not: "+a.isPresent());
		System.out.println("b is present or not: "+b.isPresent());
		
		Integer value1 = a.orElse(new Integer(1));
		Integer value2 = b.get();
		
		return value1+value2;
	}

}
