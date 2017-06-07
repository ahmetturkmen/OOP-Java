package tr.ahmetturkmen.HW3;

public class Snake extends WildAnimal {


	private boolean poisoned;


	public Snake(String name) {
		super(name);

	}


	public void crawl() {
		System.out.println(getName() + " is crawling");
	}

	@Override
	public void run() {
		System.out.println(getName() + " cannot run");
	}


	public boolean isPoisoned() {
		return poisoned;
	}

	public void setPoisoned(boolean poisoned) {
		this.poisoned = poisoned;
	}

}
