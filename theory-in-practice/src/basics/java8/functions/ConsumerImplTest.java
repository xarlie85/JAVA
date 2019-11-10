package basics.java8.functions;

import static org.junit.Assert.assertNotNull;

import java.util.function.Consumer;

public class ConsumerImplTest {
	
	public class ConsumerImpl<T> implements Consumer<T> {
		@Override
		public void accept(T t) {
			assertNotNull(t);
			System.out.println("ConsumerImpl: " + t);
		}
	}

	public static void main(String[] args) {
		Consumer<String> consString = (x) -> System.out.println("Consumer: " + x);
		consString.accept("Hola");
		
		Consumer<String> consumerImpl = new ConsumerImplTest().new ConsumerImpl<>();
		consumerImpl.accept("Hola");
	}
}
