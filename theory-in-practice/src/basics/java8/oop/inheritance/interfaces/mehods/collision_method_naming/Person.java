package basics.java8.oop.inheritance.interfaces.mehods.collision_method_naming;

public interface Person extends Animal, Human {

	default void walk() {
		Human.super.walk();
	}
	
	
}
