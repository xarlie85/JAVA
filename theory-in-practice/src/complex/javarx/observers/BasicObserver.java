package complex.javarx.observers;

import org.slf4j.*;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BasicObserver<T> implements Observer<T> {

	public static final Logger log = LoggerFactory.getLogger(BasicObserver.class);

	@Override
	public void onSubscribe(Disposable d) {
		log.info("onSubscribe Th {{}}", Thread.currentThread().getId());
	}

	@Override
	public void onNext(T value) {
		log.info(" Th {{}} - onNext - {}", Thread.currentThread().getId(), value);
	}

	@Override
	public void onError(Throwable e) {
		log.error("oneError - {}", e.getMessage());
	}

	@Override
	public void onComplete() {
		log.info("onComplete Th {{}}", Thread.currentThread().getId());
	}

}
