package basics.enums;

public enum GreekAlphabet {

	ALPHA("\u03b1"), BETHA("\u03b2"), GAMMA("\u03b3"), DELTA("\u03b4"), EPSILON("\u03b5"), ZETA("\u03b6"), ETA("\u03b7"), THETA("\u03b8"),
	IOTA("\u03b9"), KAPPA("\u03ba"), LAMBDA("\u03bb"), MU("\u03bc"), NU("\u03bd"), XI("\u03be"), OMICRON("\u03bf"), PI("\u03c0"), RHO("\u03c1"),
	FINALSIGMA("\u03c2"), SIGMA("\u03c3"), TAU("\u03c4"), UPSILON("\u03c5"), PHI("\u03c6"), CHI("\u03c7"), PSI("\u03c8"), OMEGA("\u03c9");

	private String unicode;

	private GreekAlphabet(String unicode) {
		this.unicode = unicode;
	}

	@Override
	public String toString() {
		return unicode + " - " + unicode.toUpperCase() + " - " + name();
	}

}
