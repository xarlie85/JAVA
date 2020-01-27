package basics.enums;

public enum GreekAlphabet {

	ALPHA("\\U+03b1"), BETHA("\\u+03b2"), GAMMA("\\03b3"), DELTA("\\03b4"), EPSILON("\\03b5"), ZETA("\\03b6"), ETA("\\03b7"), THETA("\\03b8"),
	IOTA("\\03b9"), KAPPA("\\03ba"), LAMBDA("\\03bb"), MU("\\03bc"), NU("\\03bd"), XI("\\03be"), OMICRON("\\03bf"), PI("\\03c0"), RHO("\\03c1"),
	SIGMA("\\03c2"), TAU("\\03c3"), UPSILON("\\03c4"), PHI("\\03c5"), CHI("\\03c6"), PSI("\\03c7"), OMEGA("\\03c8");

	private String unicode;

	private GreekAlphabet(String unicode) {
		this.unicode = unicode;
	}

	@Override
	public String toString() {
		return name() + "::" + unicode;
	}

}
