package complex.javarx.observers;

import org.slf4j.*;

import io.reactivex.MaybeObserver;
import io.reactivex.disposables.Disposable;

public class BasicMaybeObserver<T> implements MaybeObserver<T> {

	public static final Logger log = LoggerFactory.getLogger(BasicMaybeObserver.class);

	@Override
	public void onSubscribe(Disposable d) {
		log.info("onSubscribe Th {{}}", Thread.currentThread().getId());
	}

	@Override
	public void onSuccess(T value) {
		log.info("onSuccess Th {{}} - {}", Thread.currentThread().getId(), value);
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
