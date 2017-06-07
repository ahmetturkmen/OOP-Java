package tr.ahmetturkmen.HW3;

public class Bird extends Pet {

	public Bird(String name) {
		super(name);
		setNumberOfLegs(2);
		setNumberOfWings(2);
	}

	@Override
	public void fly() {
		System.out.println(getName() + " is flying ");
	}

	@Override
	public void run() {
		System.out.println(getName() + " cannot run");
	}

	@Override
	public void talk() {
		System.out.println("CHIRP");
	}


}
