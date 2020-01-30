package complex.javarx.observers;

import org.slf4j.*;

import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;

public class BasicSingleObserver<T> implements SingleObserver<T> {

	public static final Logger log = LoggerFactory.getLogger(BasicSingleObserver.class);

	@Override
	public void onSubscribe(Disposable d) {
		log.info("onSubscribe Th {{}}", Thread.currentThread().getId());
	}

	@Override
	public void onError(Throwable e) {
		log.error("oneError - {}", e.getMessage());
	}

	@Override
	public void onSuccess(T value) {
		log.info("onSuccess Th {{}} - {}", Thread.currentThread().getId(), value);
	}

}
