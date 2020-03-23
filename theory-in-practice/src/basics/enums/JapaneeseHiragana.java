package basics.enums;

import java.util.Arrays;
import java.util.stream.Collectors;

public enum JapaneeseHiragana implements Comparable<JapaneeseHiragana> {

	A("\u3042"), I("\u3044"), U("\u3046"), E("\u3048"), O("\u304a"), DEF("?");

	private final String unicode;

	private JapaneeseHiragana(String unicode) {
		this.unicode = unicode;
	}

	@Override
	public String toString() {
		return "<<" + name() + ">> - " + unicode;
	}

	public String getUnicode() {
		return unicode;
	}

	public String[] getJapaneeseLetters() {
		return (String[]) Arrays.asList(values()).stream().map(l -> l.getUnicode()).collect(Collectors.toList()).toArray();
	}
}
