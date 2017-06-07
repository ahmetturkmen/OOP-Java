package tr.ahmetturkmen.HW3;

public class Eagle extends WildAnimal {

	public Eagle(String name) {
		super(name);
		setHabitat("mountain");
		setNumberOfLegs(2);
		setNumberOfWings(2);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying");
	}

	@Override
	public void run() {
		System.out.println(getName() + " cannot run ");
	}
}
