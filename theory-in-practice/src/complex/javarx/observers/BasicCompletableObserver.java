package complex.javarx.observers;

import org.slf4j.*;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;

public class BasicCompletableObserver implements CompletableObserver {

	public static final Logger log = LoggerFactory.getLogger(BasicCompletableObserver.class);

	@Override
	public void onSubscribe(Disposable d) {
		log.info("onSubscribe Th {{}}", Thread.currentThread().getId());
	}

	@Override
	public void onComplete() {
		log.info("onComplete Th {{}}", Thread.currentThread().getId());
	}

	@Override
	public void onError(Throwable e) {
		log.error("oneError - {}", e.getMessage());
	}

}
