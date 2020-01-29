package basics.inheritance;

public interface ConstantsChild {

	default String reverse(String stringToInvert) {
		StringBuilder sb = new StringBuilder(stringToInvert);
		return sb.reverse().toString();
	}

	void dontDoIt();

	public interface ConstantsGrandChild extends ConstantsChild {
		void doSomething();
	}
}
