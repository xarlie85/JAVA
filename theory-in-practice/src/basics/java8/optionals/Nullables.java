package basics.java8.optionals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

public class Nullables {
	
	public static void main (String[]args)throws Exception{
		HashMap<Integer, List<Integer>> hm = new HashMap<>();
		ArrayList<Integer> l = new ArrayList<>();
		l.add(1);
		l.add(2);
		l.add(3);
		hm.put(1, l);
		for (int i = 0; i < 3; i++) {
			System.out.print(i+": ");
			List<Integer> l2 = Optional.ofNullable(hm.get(i))
					.orElse(Collections.emptyList());
			System.out.println(l2);
		}
	} 

}
