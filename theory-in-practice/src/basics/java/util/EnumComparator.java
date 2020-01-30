package basics.java.util;

import java.util.Comparator;

import basics.enums.JapaneeseHiragana;

public class EnumComparator implements Comparator<JapaneeseHiragana> {

	@Override
	public int compare(JapaneeseHiragana o1, JapaneeseHiragana o2) {
		return o1.getUnicode().compareTo(o2.getUnicode());
	}

}
