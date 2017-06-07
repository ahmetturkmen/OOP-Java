package tr.ahmetturkmen.HW3;

public class WildAnimal extends Animal {

	private String habitat;

	public WildAnimal(String name) {
		super(name);
		this.habitat = "forest";
		setNumberOfLegs(0);
		setNumberOfWings(0);
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}


}
