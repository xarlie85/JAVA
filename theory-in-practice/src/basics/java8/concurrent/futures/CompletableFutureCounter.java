package basics.java8.concurrent.futures;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeoutException;

/***
 * Stupid example of a counter using Synchronized Threads taken from a
 * ThreadPool and using {@link CompletableFuture} objects.
 */
public class CompletableFutureCounter implements Runnable {

	private int sharedCount;
	private Map<Long, Integer> threads = new HashMap<>();

	public static void main(String[] args)
			throws InterruptedException, ExecutionException, InstantiationException, IllegalAccessException, TimeoutException {
		System.out.println("main thread::id::" + Thread.currentThread().getId());

		Executor executor = Executors.newFixedThreadPool(10);
		CompletableFutureCounter counter = new CompletableFutureCounter();
		CompletableFuture<Void> future = CompletableFuture.runAsync(counter, executor);
		CompletableFuture<Void> future2 = CompletableFuture.runAsync(counter, executor);
		CompletableFuture<Void> future3 = CompletableFuture.runAsync(counter, executor);

		future.get();
		future2.get();
		future3.get();

		System.out.println("I finished!");
	}

	@Override
	public void run() {
		countSync();
	}

	private void countSync() {
		while (true) {
			synchronized (this) {
				sharedCount++;
				System.out.println("thread::id::" + Thread.currentThread().getId() + " count:" + sharedCount);
//				threads.computeIfPresent(Thread.currentThread().getId(), (k, v) -> ++v);
//				threads.putIfAbsent(Thread.currentThread().getId(), 1);
			}
		}
	}

}
