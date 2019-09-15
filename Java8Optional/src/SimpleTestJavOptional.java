import java.util.Optional;

public class SimpleTestJavOptional {

	public static void main(String[] args) {
		Optional<String> name = Optional.ofNullable("x");
		String x = "cc";
		String y = "dd";
		String z = "";
		
		System.out.println("x value"+Optional.ofNullable(x));
		System.out.println("y value"+Optional.ofNullable(y));
		System.out.println("z value"+Optional.of(z));
		
	}

}
