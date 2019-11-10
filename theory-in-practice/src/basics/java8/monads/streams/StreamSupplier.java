package basics.java8.monads.streams;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamSupplier {

	public static void streamWithSupplier() {
		Supplier<Stream<String>> streamSupplier 
		  = () -> Stream.of("A", "B", "C", "D");
		Optional<String> result1 = streamSupplier.get().findAny();
		System.out.println(result1.get());
		Optional<String> result2 = streamSupplier.get().findFirst();
		System.out.println(result2.get());
	}

	public static void streamWithoutSupplier() {
		Stream<String> stringStream = Stream.of("A", "B", "C", "D");
		Optional<String> result1 = stringStream.findAny();
		System.out.println(result1.get());

		Optional<String> result2 = stringStream.findFirst();
		System.out.println(result2.get());
	}

	public static void main(String[] args) {

		
		StreamSupplier.streamWithSupplier();
	}

}
