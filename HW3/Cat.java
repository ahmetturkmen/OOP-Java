package tr.ahmetturkmen.HW3;

public class Cat extends Pet {

	public Cat(String name) {
		super(name);

	}

	public void cleanHimself() {
		System.out.println(getName() + " is clean now");
	}

	@Override
	public void talk() {
		System.out.println("MEOW");
	}
}
