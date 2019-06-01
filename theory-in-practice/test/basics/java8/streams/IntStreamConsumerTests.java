package basics.java8.streams;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class IntStreamConsumerTests {

	private IntStreamConsumer cut;

	@Before
	public void setUp() {
		cut = new IntStreamConsumer();
	}

	@Test
	@Ignore
	public void infiniteStream_CAREFUL_BECAUSE_NEVER_STOPS() {
		cut.accidentalInfiniteStream();
	}

	@Test
	public void infiniteStream_solution_works() {
		cut.accidentalInfiniteStream_solution();
	}

	@Test
	public void walkStreamWithOffset() {
		cut.walkStreamWithOffset();
	}

}
