package tr.ahmetturkmen.HW3;


import java.util.Scanner;

public class Main {
	private static Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		String[] array, array2;
		String input = "0";
		Animal[] animals = new Animal[100];
		int indexOfAnimals = 0;

		System.out.println("Please enter <Name> <Type> of animals. Enter END to pass to second level.");

		while (!input.equals("END")) {
			input = read.nextLine();
			if ( input.equals("END") )
				break;
			array = input.split(" ");

			if ( array[1].equals("Bird") ) {
				animals[indexOfAnimals] = new Bird(array[0]);
				indexOfAnimals++;
			}
			if ( array[1].equals("Eagle") ) {
				animals[indexOfAnimals] = new Eagle(array[0]);
				indexOfAnimals++;
			}
			if ( array[1].equals("Fish") ) {
				animals[indexOfAnimals] = new Fish(array[0]);
				indexOfAnimals++;
			}
			if ( array[1].equals("Dog") ) {
				animals[indexOfAnimals] = new Dog(array[0]);
				indexOfAnimals++;
			}
			if ( array[1].equals("Cat") ) {
				animals[indexOfAnimals] = new Cat(array[0]);
				indexOfAnimals++;
			}
			if ( array[1].equals("Snake") ) {
				animals[indexOfAnimals] = new Snake(array[0]);
				indexOfAnimals++;
			}
		}


		String input2 = " ";
		System.out.println("Enter <command> <animal> [<option>]. Enter EXIT to exit the program.");

		while (!input2.equals("EXIT")) {
			input2 = read.nextLine();
			array2 = input2.split(" ");

			// For Bird class

			for ( int i = 0; i < animals.length; i++ ) {
				if ( animals[i] instanceof Bird && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					((Bird) animals[i]).talk();

				else if ( animals[i] instanceof Bird && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					((Bird) animals[i]).fly();

				else if ( animals[i] instanceof Bird && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					((Bird) animals[i]).run();

				else if ( animals[i] instanceof Bird && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());

				else if ( animals[i] instanceof Bird && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfLegs());

				else if ( animals[i] instanceof Pet && array2[0].equals("feed") && array2[1].equals(animals[i].getName()) )
					((Pet) animals[i]).feet(Integer.parseInt(array2[2]));

				else if ( animals[i] instanceof Pet && array2[0].equals("costOfFeed") && array2[1].equals(animals[i].getName()) )
					System.out.println(((Pet) animals[i]).getCostOfFeeding());


					// For Cat class

				else if ( animals[i] instanceof Cat && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					animals[i].talk();

				else if ( animals[i] instanceof Cat && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					animals[i].fly();

				else if ( animals[i] instanceof Cat && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					animals[i].run();

				else if ( animals[i] instanceof Cat && array2[0].equals("clean") && array2[1].equals(animals[i].getName()) )
					((Cat) animals[i]).cleanHimself();

				else if ( animals[i] instanceof Cat && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());

				else if ( animals[i] instanceof Cat && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfLegs());

				else if ( animals[i] instanceof Pet && array2[0].equals("feed") && array2[1].equals(animals[i].getName()) )
					((Pet) animals[i]).feet(Integer.parseInt(array2[2]));

				else if ( animals[i] instanceof Pet && array2[0].equals("costOfFeed") && array2[1].equals(animals[i].getName()) )
					System.out.println(((Pet) animals[i]).getCostOfFeeding());

					// For Dog class

				else if ( animals[i] instanceof Dog && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					animals[i].talk();

				else if ( animals[i] instanceof Dog && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					animals[i].fly();

				else if ( animals[i] instanceof Dog && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					animals[i].run();

				else if ( animals[i] instanceof Dog && array2[0].equals("walk") && array2[1].equals(animals[i].getName()) )
					((Dog) animals[i]).walk();

				else if ( animals[i] instanceof Dog && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());

				else if ( animals[i] instanceof Dog && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfLegs());

				else if ( animals[i] instanceof Pet && array2[0].equals("feed") && array2[1].equals(animals[i].getName()) )
					((Pet) animals[i]).feet(Integer.parseInt(array2[2]));

				else if ( animals[i] instanceof Pet && array2[0].equals("costOfFeed") && array2[1].equals(animals[i].getName()) )
					System.out.println(((Pet) animals[i]).getCostOfFeeding());


					// For Fish class

				else if ( animals[i] instanceof Fish && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					animals[i].talk();

				else if ( animals[i] instanceof Fish && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					animals[i].fly();

				else if ( animals[i] instanceof Fish && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					animals[i].run();

				else if ( animals[i] instanceof Fish && array2[0].equals("swim") && array2[1].equals(animals[i].getName()) )
					((Fish) animals[i]).swim();

				else if ( animals[i] instanceof Fish && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());

				else if ( animals[i] instanceof Fish && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfLegs());

				else if ( animals[i] instanceof Pet && array2[0].equals("feed") && array2[1].equals(animals[i].getName()) )
					((Pet) animals[i]).feet(Integer.parseInt(array2[2]));

				else if ( animals[i] instanceof Pet && array2[0].equals("costOfFeed") && array2[1].equals(animals[i].getName()) )
					System.out.println(((Pet) animals[i]).getCostOfFeeding());


					// For Snake class

				else if ( animals[i] instanceof Snake && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					animals[i].talk();

				else if ( animals[i] instanceof Snake && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					animals[i].fly();

				else if ( animals[i] instanceof Snake && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					animals[i].run();

				else if ( animals[i] instanceof Snake && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());


				else if ( animals[i] instanceof Snake && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println((animals[i]).getNumberOfLegs());


				else if ( animals[i] instanceof Snake && array2[0].equals("crawl") && array2[1].equals(animals[i].getName()) )
					((Snake) animals[i]).crawl();

				else if ( animals[i] instanceof Snake && array2[0].equals("habitat") && array2[1].equals(animals[i].getName()) )
					System.out.println(((Snake) animals[i]).getHabitat());


					// For Eagle class

				else if ( animals[i] instanceof Eagle && array2[0].equals("talk") && array2[1].equals(animals[i].getName()) )
					animals[i].talk();

				else if ( animals[i] instanceof Eagle && array2[0].equals("fly") && array2[1].equals(animals[i].getName()) )
					animals[i].fly();

				else if ( animals[i] instanceof Eagle && array2[0].equals("run") && array2[1].equals(animals[i].getName()) )
					animals[i].run();

				else if ( animals[i] instanceof Eagle && array2[0].equals("wingCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfWings());

				else if ( animals[i] instanceof Eagle && array2[0].equals("legCount") && array2[1].equals(animals[i].getName()) )
					System.out.println(animals[i].getNumberOfLegs());

				else if ( animals[i] instanceof Eagle && array2[0].equals("habitat") && array2[1].equals(animals[i].getName()) )
					System.out.println(((WildAnimal) animals[i]).getHabitat());


			}

		}


	}


}








