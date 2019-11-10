package basics.java8.monads;

import java.util.ArrayList;
import java.util.List;

public class MyMonad {

	private List<String> wrappedList;

	public MyMonad() {
		wrappedList = new ArrayList<>();
	}

	public List<String> getValues() {
		return this.wrappedList;
	}
}
