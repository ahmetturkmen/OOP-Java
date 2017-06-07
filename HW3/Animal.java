package tr.ahmetturkmen.HW3;

public class Animal {

	private String name;
	private int numberOfLegs;
	private int numberOfWings;

	public Animal(String name) {
		this.name = name;
		this.numberOfLegs = 4;
		this.numberOfWings = 0;

	}


	public void fly() {
		System.out.println(getName() + " cannot fly");
	}

	public void run() {
		System.out.println(getName() + " is running");
	}

	public void talk() {
		System.out.println("<Silence>");
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public int getNumberOfWings() {
		return numberOfWings;
	}

	public void setNumberOfWings(int numberOfWings) {
		this.numberOfWings = numberOfWings;
	}


}

