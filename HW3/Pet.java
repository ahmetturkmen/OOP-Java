package tr.ahmetturkmen.HW3;

public class Pet extends Animal {
	private int costOfFeeding = 0;    // This variable defines the total money that
									 // the pet owner spent for each pet

	public int getCostOfFeeding() {
		return costOfFeeding;
	}

	public void setCostOfFeeding(int costOfFeeding) {
		this.costOfFeeding = costOfFeeding;
	}

	public Pet(String name) {
		super(name);
	}

	public void feet(int amount) {
		costOfFeeding += amount;
	}


}
