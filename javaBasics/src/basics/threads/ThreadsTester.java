package basics.threads;

import java.util.stream.Stream;

/**
 * This ThreadsTester is a tester Class for Threads creation.
 * 
 * @author Carlos de la Fuente Antequera
 *
 */
public class ThreadsTester {

	/**
	 * Launches more threads in parallel than the OS is allowed to. This method
	 * should end with an exception at runtime
	 */
	private static void launchMaxThreads() {
		Long threads = Long.MAX_VALUE;
		Stream.iterate(0, (z) -> z + 1).limit(threads).forEach(th -> new Thread(() -> {
			Stream.iterate(0, (z) -> z + 1).limit(3).forEach(z -> System.out.println("-Thread [" + th + "]:" + z));
		}).start());
	}

	public static void main(String[] args) {

		// launchMaxThreads();
		launchOneThread();
	}

	/**
	 * Launches just one thread. Creates the content of the thread by using the
	 * Runnable FI, implementing the void run() method with a lambda expression. ()
	 * -> {return;} matches the run() abstract method of the Runnable FI.
	 */
	private static void launchOneThread() {
		new Thread(() -> System.out.println("I am implementing the void run() abstract method of the Runnable FI."))
				.start();
	}
}
