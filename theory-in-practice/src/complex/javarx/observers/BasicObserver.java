package complex.javarx.observers;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.slf4j.*;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BasicObserver<T> implements Observer<T> {

	public static final Logger log = LoggerFactory.getLogger(BasicObserver.class);
	public static AtomicInteger numObservers = new AtomicInteger(0);

	@Override
	public void onSubscribe(Disposable d) {
		log.info("onSubscribe Th {{}} ", Thread.currentThread().getId());
	}

	@Override
	public void onNext(T value) {
		try {
			TimeUnit.MILLISECONDS.sleep(1L);
		} catch (InterruptedException e) {
			log.error(e.getMessage());
			e.printStackTrace();
		}
		log.info(" Th {{}} - onNext - {}", Thread.currentThread().getId(), value);

	}

	@Override
	public void onError(Throwable e) {
		log.info("oneError - {}", e.getMessage());
	}

	@Override
	public void onComplete() {
		log.info("onComplete Th {{}}", Thread.currentThread().getId());
	}

}
