package basics.java8.streams;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class IntStreamConsumerTests {
	final Logger logger = LoggerFactory.getLogger(IntStreamConsumerTests.class);

	private IntStreamConsumer cut;
	String methodName;

	@Before
	public void setUp() {
		cut = new IntStreamConsumer();
	}

	@Test
	@Ignore
	public void infiniteStream_CAREFUL_BECAUSE_NEVER_STOPS() {
		logger.info("run");
		cut.accidentalInfiniteStream();
	}

	@Test
	public void infiniteStream_solution_works() {
		logger.info("run");
		cut.accidentalInfiniteStream_solution();
	}

	@Test
	public void walkStreamWithOffset() {
		logger.info("run");
		cut.walkStreamWithOffset();
	}

	@Test
	public void concurrentlyModifyStreamedList_works() {
		logger.info("run");
		cut.concurrentlyModifyStreamedList();
	}

	@Test
	public void peekingOnStream() {
		logger.info("run");
		cut.peekingOnStream();
	}
}
