package basics.functions;

import java.util.Comparator;
import java.util.Objects;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.BooleanSupplier;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class FunctionalInterfaceInitializer<T, U, V> {

	@FunctionalInterface
	public interface TernaryFunction<T, U, V, R> {
		public R apply(T t, U u, V v);
	}

	T t;
	U u;
	V v;

	public static void main(String[] args) {
		supplierTest();
		consumerTest();
		functionTest();
		predicateTest();
		bifunctionTest();
		booleanSupplierTest();
		functionBinaryTest();
		functionTernaryTest();
		triFunctionTest();
	}

	/**
	 * Uses the concept of <i>Monads</i>
	 * 
	 * @param triFunc
	 *            New created FI, as a test for a yet non-existing three parameter
	 *            FI Function FI
	 * @return
	 */
	public <R> R method(TernaryFunction<T, U, V, R> triFunc) {
		Objects.requireNonNull(triFunc);
		return triFunc.apply(t, u, v);
	}

	/**
	 * Implements a Supplier FI
	 */
	public static void supplierTest() {
		Supplier<String> supplier = () -> "hola";
		System.out.println("Supplier: " + supplier.get());
	}

	/**
	 * Implements Consumer FI
	 */
	public static void consumerTest() {
		Consumer<String> cons = (x) -> System.out.println("Consumer: " + x);
		cons.accept("s");
	}

	/**
	 * Calling a method with parameter new created/implemented Ternary FI
	 */
	private static void triFunctionTest() {
		FunctionalInterfaceInitializer<String, Integer, Float> lambda = new FunctionalInterfaceInitializer<>();
		lambda.v = 1.546f;

		System.out.println(lambda.method((x, y, z) -> z));

	}

	/**
	 * Implements TernaryFunciton FI (new)
	 */
	private static void functionTernaryTest() {
		TernaryFunction<String, Integer, Float, Float> triFunc = (x, y, z) -> z;
		System.out.println(triFunc.apply("hola", 1, 1.2345f));
	}

	/**
	 * Implements BinaryFunction FI
	 * 
	 * @return returns a float parsed from the first x (String) parameter
	 */
	public static void functionBinaryTest() {
		BiFunction<String, Integer, Float> biFunction = (x, y) -> Float.parseFloat(x);
		System.out.println(biFunction.apply("1.2", 2));
	}

	/**
	 * Implements Function FI
	 * 
	 * @return Sum of ASCII values of all the caracters in a string
	 */
	public static void functionTest() {
		Function<String, Integer> sumOfCharsInAString = (x) -> {
			Supplier<IntStream> sChars = () -> x.chars();
			sChars.get().forEach(System.out::println);
			return sChars.get().sum();
		};
		System.out.println("Function sumOfCharsInString: " + sumOfCharsInAString.apply("hihihi"));
	}

	/**
	 * Implements Predicate FI
	 * 
	 * @return returns boolean of x.length > 0
	 */
	private static void predicateTest() {
		Predicate<String> pred = x -> x.length() > 0;
		System.out.println("Predicate: " + pred.test(""));
	}

	/**
	 * Creates a BiFunction FI
	 * 
	 * 
	 * @return The sum of t.length and u
	 */
	public static void bifunctionTest() {
		BiFunction<String, Integer, Long> biFunc = (t, u) -> {
			return Integer.valueOf(t.length() + u.intValue()).longValue();
		};
		System.out.println("BiFunction: " + biFunc.apply("hola", 2));
	}

	/**
	 * Creates a BooleanSupplier FI implementation: supplies a boolean
	 */
	public static void booleanSupplierTest() {
		BooleanSupplier boolSup = () -> String.valueOf(true) != null;
		System.out.println("BooleanSupplier: " + boolSup.getAsBoolean());
	}

	/**
	 * Creates a comparator FI implementation: Compares Strings by lengths
	 */
	public static void binaryOperatorTest() {
		Comparator<String> comparator = (t, u) -> {
			return t.length() - u.length();
		};

		BinaryOperator<String> stringBinaryOp = (t, u) -> {
			Objects.requireNonNull(comparator);
			return BinaryOperator.maxBy(comparator).apply(t, u);
		};

		System.out.println();

		stringBinaryOp.apply("carro", "mato");
	}

}
