import java.util.Optional;

public class OptionalExTest {

	public static void main(String[] args) {
		OptionalExTest optionalEx = new OptionalExTest();
		Integer a = null;
		Integer b = new Integer(10);
		
		
		
		Optional<Integer> d = Optional.ofNullable(a);
		System.out.println("d value"+d);
	} 

}
