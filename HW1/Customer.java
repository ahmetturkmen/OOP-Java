package HW2;

public class Customer {

	private String name;
	int indexOfItem = 0;
	int j = 0, calculatedPayment = 0, discountPayment = 0;
	private int promotion, f = 0;
	private Item[] basket = new Item[31]; 	// the last array element
											// which has " " value is
											// controlling of updating array

	public Customer() {
		this.name = "Unknown";
		this.promotion = 70;
	}

	public Customer(String name) {
		this.name = name;
		this.promotion = 100;

	}

	public Customer(String name, int promotion) {

		this.name = name;
		if (promotion < 0 || promotion > 100)	 // CHECK THAT THE PROMOTION VALUE
												// IS VALID OR NOT
			this.promotion = 100;
		this.promotion = promotion;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPromotion(int promotion) {
		this.promotion = promotion;
	}

	public int getPromotion() {
		return this.promotion;
	}

	public void deleteItem(String itemName) {
		int k = 0;
		for (j = 0; j < basket.length - 1; j++) {
			if (basket[j].getName().equals(itemName)) // for finding the index
														// of entered data
				break;
		}

		for (k = j; k < j + (indexOfItem - j); k++) {
			if (!basket[j].equals(" ")) {
				basket[k].setName(basket[k + 1].getName());
				basket[k].setPrice(basket[k + 1].getPrice());
			}
		}
		j = 0;
		indexOfItem--;
		calculatedPayment = 0; // to prevent miscalculation
	}

	public void addItem(Item item) {
		if (indexOfItem == 30)
			System.out.println("Choose another customer or delete item. Your basket is full");
		else
			while (indexOfItem < 30) {
				basket[indexOfItem].setName(item.getName());
				basket[indexOfItem].setPrice(item.getPrice());
				indexOfItem++;
				break;
			}

	}

	public void listItem() {

		for (f = 0; f < indexOfItem; f++) {
			if (!basket[f].getName().equals(" ")) {
				System.out.println((f + 1) + " " + basket[f].getName() + " " + basket[f].getPrice());
				calculatedPayment += basket[f].getPrice();

			}
		}
		System.out.println("Total price: " + calculatedPayment);
		discountPayment = calculatedPayment * getPromotion() / 100;
		System.out.println("Discount price : " + discountPayment);
		calculatedPayment = 0;
	}

	public void setBasket(Item[] basket) {
		this.basket = basket;
	}
}
