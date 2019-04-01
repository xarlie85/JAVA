package basics.annotations.runtime;

@CheckType("Mammal")
public class Animal {

	@JsonField("Nick")
	public String name;
	
	public Animal(String name) {
		this.name = name;
	}
}
