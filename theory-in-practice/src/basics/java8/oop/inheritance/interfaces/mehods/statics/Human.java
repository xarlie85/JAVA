package basics.java8.oop.inheritance.interfaces.mehods.statics;

public interface Human<R> {

	public default R steps(R steps) {
		return steps;
	}
	
	public default R walk(R r) {
		System.out.println("Human walking");
		return r;
	}
	
	public default String run(String s) {
		System.out.println("Human running");
		return s;
	}
	
	public static void sit() {
		System.out.println("Human sitting");
	}
	
}
