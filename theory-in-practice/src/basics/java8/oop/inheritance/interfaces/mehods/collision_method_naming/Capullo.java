package basics.java8.oop.inheritance.interfaces.mehods.collision_method_naming;

public class Capullo implements Human, Animal {

	public void walk() {
		Animal.super.walk();
	}

}
