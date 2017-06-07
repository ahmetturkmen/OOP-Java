package HW2;

import java.util.Scanner;

public class Main {

	private static Scanner read = new Scanner(System.in); // in some cases for
															// instance in
															// method this
															// must be declared
															// as static
	private static int option, innerOption;

	public static void main(String[] args) {
		int indexO = 0, index1 = 0, index2 = 0;
		// TODO Auto-generated method stub
		Customer c1 = new Customer("Ali", 90);
		Customer c2 = new Customer("Ayse");
		Customer c3 = new Customer();
		Item[] b1 = new Item[31]; // Created 3 different basket for 3 customers
		Item[] b2 = new Item[31];
		Item[] b3 = new Item[31];

		for (int i = 0; i < b1.length; i++) { // Initiating arrays and set them
												// our purpose meaning that put
												// " " inside of them
			b1[i] = new Item();
			b2[i] = new Item();
			b3[i] = new Item();
			b1[i].setName(" ");
			b2[i].setName(" ");
			b3[i].setName(" ");
		}

		c1.setBasket(b1); // Set specific basket to specific customer (EASY TO
							// MANAGE)
		c2.setBasket(b2);
		c3.setBasket(b3);

		option = 0;
		while (option != 4) { // Continue until user pressed 4

			System.out.println(" (1) Ali \n (2) Ayse \n (3) unknown \n (4) Terminate");
			option = read.nextInt();

			// -------- FOR CUSTOMER Ali ------

			if (option == 1) {
				System.out.println(" (1) AddItem \n (2) DeleteItem \n (3) ListItems");
				innerOption = read.nextInt();

				while (innerOption == 1 && indexO != 30) {
					System.out.println("Enter the name of the item: ");
					b1[indexO].setName(read.next());
					System.out.println("Enter the prize of the item: ");
					b1[indexO].setPrice(read.nextInt());
					c1.addItem(b1[indexO]);
					indexO++;
					break;
				}

				if (innerOption == 3)
					c1.listItem();

				if (innerOption == 2) {
					System.out.println("Enter the name of the item: ");
					c1.deleteItem(read.next());
					indexO--;

				}
			}

			// -------- FOR CUSTOMER Ayse ------

			if (option == 2) {

				System.out.println(" (1) AddItem \n (2) DeleteItem \n (3) ListItems");
				innerOption = read.nextInt();
				while (innerOption == 1 && index1 != 30) {
					System.out.println("Enter the name of the item: ");

					b2[index1].setName(read.next());

					System.out.println("Enter the prize of the item: ");
					b2[index1].setPrice(read.nextInt());

					c2.addItem(b2[index1]);
					index1++;
					break;

				}

				if (innerOption == 3)
					c2.listItem();

				if (innerOption == 2) {
					System.out.println("Enter the name of the item: ");
					c2.deleteItem(read.next());
					index1--;
				}

			}

			// -------- FOR CUSTOMER Unknown ------

			if (option == 3) {

				System.out.println(" (1) AddItem \n (2) DeleteItem \n (3) ListItems");
				innerOption = read.nextInt();

				while (innerOption == 1 && index2 != 30) { // check the item of
															// index to be sure
															// that the limit is
															// not exceeded
					
					System.out.println("Enter the name of the item: ");
					b3[index2].setName(read.next());
					System.out.println("Enter the prize of the item: ");
					b3[index2].setPrice(read.nextInt());
					c3.addItem(b3[index2]);
					index2++;
					break;
				}

				if (innerOption == 3)
					c3.listItem();
				if (innerOption == 2) {
					System.out.println("Enter the name of the item: ");
					c3.deleteItem(read.next());
					index2--;
				}
			}

		}

		// ----- TERMINATE PROGRAM

		if (option == 4) // Exit without giving any information
			System.exit(0);

	}

}
