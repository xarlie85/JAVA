package basics.java8.streams;

import java.util.stream.IntStream;

public class IntStreamConsumer {

	static int[] intArray = { 1, 1, 1, 1, 3, 2, 5, 6, 3 };

	/**
	 * This is an example for showing the importance of applying the Stream methods
	 * carefully ordered.
	 */
	public void accidentalInfiniteStream() {
		IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(10).forEach(System.out::println);
	}

	public void accidentalInfiniteStream_solution() {
		IntStream.iterate(0, i -> (i + 1) % 2).limit(10).distinct().forEach(System.out::println);
	}

	public void walkStreamWithOffset() {
		IntStream.iterate(0, i -> i + 1).skip(5).limit(10).forEach(System.out::println);
	}

}
