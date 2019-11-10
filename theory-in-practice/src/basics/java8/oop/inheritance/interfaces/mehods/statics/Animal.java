package basics.java8.oop.inheritance.interfaces.mehods.statics;

public interface Animal<S> {

	public default S walk(S s) {
		System.out.println("animal walking");
		return s;
	}
	
	public default Integer run (Integer steps) {
		System.out.println("Animal running");
		return steps;
	}
}
