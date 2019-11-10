package basics.java8.functions;

import java.util.OptionalDouble;
import java.util.function.Function;

public class FunctionImplTest {

	public class FunctionImpl implements Function<String, Integer> {
		@Override
		public Integer apply(String s) {
			return s.chars().sum();
		}
	}

	public class FunctionImpl2 implements Function<String, OptionalDouble> {
		@Override
		public OptionalDouble apply(String s) {
			return s.chars().average();
		}
	}

	public static void main(String[] args) {
		Function<String, Integer> FunctionImpl2SumCharsInAString = new FunctionImplTest().new FunctionImpl();
		Function<String, OptionalDouble> FunctionImpl2averageCharsInAString = new FunctionImplTest().new FunctionImpl2();

		System.out.println("Function sumOfCharsInString: " + FunctionImpl2SumCharsInAString.apply("hihihi"));
		System.out.println("Function averageOfCharsInString: " + FunctionImpl2averageCharsInAString.apply("hihihi"));

		// Java 8: long way
		Function<String, Integer> sumOfCharsInAString = (x) -> {
			return x.chars().sum();
		};
		Function<String, OptionalDouble> averageCharsInAString = (x) -> {
			return x.chars().average();
		};

		System.out.println("Function sumOfCharsInString: " + sumOfCharsInAString.apply("hihihi"));
		System.out.println("Function averageOfCharsInString: " + averageCharsInAString.apply("hihihi"));

		// Java 8: short way
		System.out.println("Function sumOfCharsInString: " + ("hihihi").chars().sum());
		System.out.println("Function averageOfCharsInString: " + ("hihihi").chars().average());

	}
}
