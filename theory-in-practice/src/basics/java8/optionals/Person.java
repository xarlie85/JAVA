package basics.java8.optionals;

import java.util.Optional;

public interface Person {

	public default Optional<Integer> getAge() {
		Optional<Integer> opt = Optional.empty();
		return opt;
	}
}
