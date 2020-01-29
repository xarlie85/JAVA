package basics.inheritance;

public class Child extends Parent implements ConstantsChild {

	public Child(String word) {
		super(word);
	}

	public void Parent(String word) {
		// this is not overriding the Parent's constructor
	}

	@Override
	public void dontDoIt() {
		System.out.println("implementing dontDoIt");
	}

	public static void main(String[] args) {
		Child child = new Child("something");
	}
}
