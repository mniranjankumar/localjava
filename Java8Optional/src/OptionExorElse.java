import java.util.Optional;

public class OptionExorElse {

	public static void main(String[] args) {
		Optional<String> gender = Optional.of("MALE");
		Optional<String> empty = Optional.empty();
		
		System.out.println("gender :"+gender.orElse("<N/A>"));
		System.out.println("gender :"+empty.orElse("<N/A>"));
		
		System.out.println(gender.orElseGet(()-> "N/A"));
		System.out.println(empty.orElseGet(()-> "N/A"));
	}

}
