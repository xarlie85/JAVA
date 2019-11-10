package basics.java8.dates;

import java.time.LocalDate;
import java.util.stream.IntStream;

public class AtomicDate {

	static LocalDate localDate = LocalDate.now();

	public static Runnable getConcurrentDate() {
		Runnable runnable = () -> {
			IntStream.iterate(0, i -> i + 1).limit(100).forEach((i) -> {
				localDate = localDate.plusDays(i);
				System.out.println(localDate);
			});
		};
		return runnable;
	}

	public static void main(String[] args) {

		Thread thread = new Thread(getConcurrentDate());
		thread.start();
		Thread thread2 = new Thread(getConcurrentDate());
		thread2.start();
		Thread thread3 = new Thread(getConcurrentDate());
		thread3.start();
		Thread thread4 = new Thread(getConcurrentDate());
		thread4.start();

	}
}
