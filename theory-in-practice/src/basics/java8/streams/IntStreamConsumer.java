package basics.java8.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntStreamConsumer {

	final Logger logger = LoggerFactory.getLogger(IntStreamConsumer.class);
	static int[] intArray = { 1, 1, 1, 1, 3, 2, 5, 6, 3 };

	/**
	 * This is an example for showing the importance of applying the Stream methods
	 * carefully ordered.
	 */
	public void accidentalInfiniteStream() {
		logger.info("run");
		IntStream.iterate(0, i -> (i + 1) % 2).distinct().limit(10).forEach(System.out::println);
	}

	public void accidentalInfiniteStream_solution() {
		logger.info("run");
		IntStream.iterate(0, i -> (i + 1) % 2).limit(10).distinct().forEach(System.out::println);
	}

	public void walkStreamWithOffset() {
		logger.info("run");
		IntStream.iterate(0, i -> i + 1).skip(5).limit(10).forEach(System.out::println);
	}

	public void concurrentlyModifyStreamedList() {
		logger.info("run");
		List<Integer> intList = IntStream.range(0, 10).boxed().collect(Collectors.toList());
		try {
			intList.stream().peek(intList::remove).forEach(System.out::println);
		} catch (Exception e) {
			intList.stream().forEach(System.out::println);
		} finally {
			intList.stream().forEach(System.out::println);
		}
	}

	public void peekingOnStream() {
		logger.info("run");
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
	}

}
