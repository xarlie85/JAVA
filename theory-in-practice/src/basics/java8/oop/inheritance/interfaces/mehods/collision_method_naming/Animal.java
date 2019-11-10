package basics.java8.oop.inheritance.interfaces.mehods.collision_method_naming;

public interface Animal {

	public default void walk() {
		System.out.println("animal walking");
	}
}
