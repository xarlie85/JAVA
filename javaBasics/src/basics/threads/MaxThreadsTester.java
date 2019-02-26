package basics.threads;

import java.util.stream.Stream;

/**
 * This MaxThreadsTester is a tester Class for Threads creator.
 * 
 * @author Carlos de la Fuente Antequera
 *
 */
public class MaxThreadsTester {
	
	public static void main(String[] args) {
		
		Long threads = 5l;
		//Long threads = Long.MAX_VALUE;
		
		Stream.iterate(0, (z) -> z+1).limit(threads).forEach( th ->
			new Thread(	() -> 
			{
					Stream.iterate(0, (z) -> z+1).limit(3).forEach( z -> System.out.println("-Thread [" + th + "]:" + z));
			}).start()
		);
	}
}
