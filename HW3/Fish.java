package tr.ahmetturkmen.HW3;

public class Fish extends Pet {

	private int waterDegree;

	public int getWaterDegree() {
		return waterDegree;
	}

	public void setWaterDegree(int waterDegree) {
		this.waterDegree = waterDegree;
	}


	public Fish(String name) {
		super(name);
		setNumberOfLegs(0);
	}

	public void swim() {
		System.out.println(getName() + " is swimming");
	}

	@Override
	public void run() {
		System.out.println(getName() + " cannot run");
	}
}
