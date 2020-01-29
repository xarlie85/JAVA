package basics.inheritance;

public enum ConstantsParent {

	NORTH(90), SOUTH(270), EAST(0), WEST(180);

	private int grades;

	private ConstantsParent(int grades) {
		this.grades = grades;
	}

	@Override
	public String toString() {
		return this.name() + this.grades;
	}
}
