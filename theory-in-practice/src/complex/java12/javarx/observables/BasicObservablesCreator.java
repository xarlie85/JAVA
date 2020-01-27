package complex.java12.javarx.observables;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import basics.enums.GreekAlphabet;
import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class BasicObservablesCreator {

	public static final Logger log = LoggerFactory.getLogger(BasicObservablesCreator.class);

	public static void main(String[] args) {

		Observable.fromArray(GreekAlphabet.values())

				.subscribe(new Observer<GreekAlphabet>() {

					@Override
					public void onSubscribe(Disposable d) {
						log.info("onSubscribe {}", Thread.currentThread().getId());
					}

					@Override
					public void onNext(GreekAlphabet nextString) {
						log.info(" Thread id {} - onNext - {}", Thread.currentThread().getId(), nextString);
					}

					@Override
					public void onError(Throwable e) {
						log.error("oneError - {}", e.getMessage());

					}

					@Override
					public void onComplete() {
						log.info("onComplete {}", Thread.currentThread().getId());

					}
				});
	}

}
