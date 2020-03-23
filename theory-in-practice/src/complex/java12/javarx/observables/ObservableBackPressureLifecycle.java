package complex.java12.javarx.observables;

import org.slf4j.*;

import complex.javarx.observers.BasicObserver;
import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;

public class ObservableBackPressureLifecycle {

	private static Logger log = LoggerFactory.getLogger(ObservableBackPressureLifecycle.class);

	public static void main(String[] args) {
		log.info("onSubscribe Th {{}} ", Thread.currentThread().getId());
		Observable<Integer> rangeOfNumbers = Observable.range(1, 1_000_000_000).repeat().doOnNext(nextInt -> log.info("Next int is {}", nextInt))
				.subscribeOn(Schedulers.newThread()).observeOn(Schedulers.newThread());

		rangeOfNumbers.subscribe(new BasicObserver<>());

	}

}
