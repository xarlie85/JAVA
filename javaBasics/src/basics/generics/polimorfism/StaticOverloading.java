package robin.generics.polimorfism;

import java.util.List;
import java.util.Optional;

public class StaticOverloading<T> {

	private T object;

	static void print(Integer i) {
		System.out.println("Integer:" + i);
	}

	static void print(Optional<?> oi) {
		System.out.println("Optional:" + oi);
	}
	
	static void print(List<?> stringList) {
		stringList.stream().forEach(System.out::println);
	}

	static void print(String s) {
		System.out.println("String:" + s);
	}

	public static Optional<?> factory(Optional<?> s) {
		return s;
	}

	public static Object factory(boolean b) {

		if (b) {
			return "hola!!";
		} else {
			return Float.parseFloat("1.2f");
		}
	}

	public static void main(String[] args) {
		StaticOverloading.print(StaticOverloading.factory(Optional.of(("hola"))));
		StaticOverloading.print(StaticOverloading.factory(Optional.of(1)));

		StaticOverloading.print( (String) StaticOverloading.factory(true));
	}
}
