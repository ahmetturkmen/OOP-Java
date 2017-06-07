package tr.ahmetturkmen.HW3;

public class Dog extends Pet {
	public Dog(String name) {
		super(name);

	}

	public void walk() {
		System.out.println(getName() + " walked");
	}

	@Override
	public void talk() {
		System.out.println("BARK");
	}


}
