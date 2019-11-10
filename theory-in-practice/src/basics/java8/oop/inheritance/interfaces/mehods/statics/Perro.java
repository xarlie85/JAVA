package basics.java8.oop.inheritance.interfaces.mehods.statics;

public class Perro <R> {
	
	private R r;
	
	public R getR() {
		return r;
	}
	
	public static <T> T max(T x, T y) {
		return x.equals(y) ? x : y;
	}
}
