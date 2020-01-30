package complex.java12.javarx.observables;

import org.slf4j.*;

import basics.enums.*;
import complex.javarx.observers.*;
import io.reactivex.*;

public class ObservableCardinalities {

	private final static Logger log = LoggerFactory.getLogger(ObservableCardinalities.class);

	public static void main(String[] args) {

		// Basic observable with all the events related to GreekAlphabet letters
		Observable.fromArray(GreekAlphabet.values()).subscribe(new BasicObserver<GreekAlphabet>());

		// Single result stream
		Observable.fromArray(JapaneeseHiragana.values()).first(JapaneeseHiragana.DEF).subscribe(new BasicSingleObserver<JapaneeseHiragana>());

		// Maybe result stream - First letter (a)
		Observable.fromArray(JapaneeseHiragana.values()).firstElement().subscribe(new BasicMaybeObserver<JapaneeseHiragana>());

		// Maybe result stream - No letters
		Maybe<JapaneeseHiragana> maybeFirstJapanHiraNoEvent = Observable.fromArray(JapaneeseHiragana.values()).firstElement()
				.filter(nextLetter -> nextLetter.getUnicode().contains("@"));
		maybeFirstJapanHiraNoEvent.subscribe(new BasicMaybeObserver<>());

		// Completable result stream - No output, just success or failure
		Observable.fromArray(JapaneeseHiragana.values()).ignoreElements().subscribe(new BasicCompletableObserver());

	}
}
