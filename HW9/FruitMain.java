
import java.util.Scanner;


public class FruitMain {
	private static Fruit fruits = new Fruit();
	private static final int lengthOfFruitNamesArray = fruits.getLengthOfFruitNamesColorsArray();
	private static String[] fruitNameOnly = new String[lengthOfFruitNamesArray];
	private static String[] fruitColorOnly = new String[lengthOfFruitNamesArray];
	private static String[] splitterForColon; // colon refers ":".
	private static String[] splitterForComma;
	private static String[] fruitColors = new String[fruitNameOnly.length];
	private static String userResponse = "";
	private static String[] command;

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		splitterForColon = new String[lengthOfFruitNamesArray];
		splitterForComma = new String[lengthOfFruitNamesArray];

		fruits.readData(); // reading data from `.txt` file in Fruit class
		getFruitNames(); // getting just Fruit names

		while (!userResponse.equals("exit")) {
			System.out.println("Your command ");
			userResponse = read.nextLine();

			if (userResponse.equals("exit"))
				System.exit(0);
			else
				command = userResponse.split(" ");

			checkFruit();

		}

	}

	private static void checkFruit() {

		// !>>>> IMPORTANT <<<<<<<<!

		// Since there is no emphasize on guessing color in homework description
		// I did not consider it.

		// Colors must be entered with full name like : green, red , yELLOW ,
		// etc...

		String statement = command[1] + " is found in the dictionary\n" + "Its colors are : ";
		String colorStatement = "Fruits with color " + command[1] + "\n";

		if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[0]))
			System.out.println(statement + getFruitColors(0));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[1]))
			System.out.println(statement + getFruitColors(1));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[2]))
			System.out.println(statement + getFruitColors(2));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[3]))
			System.out.println(statement + getFruitColors(3));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[4]))
			System.out.println(statement + getFruitColors(4));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[5]))
			System.out.println(statement + getFruitColors(5));
		else if (command[0].equals("fruit") && command[1].equalsIgnoreCase(fruitNameOnly[6]))
			System.out.println(statement + getFruitColors(6));
		else if (command[0].equals("color")) {
			System.out.println(colorStatement + checkColorMatch());
		} else
			guessFruit();

	}

	private static void guessFruit() {

		String temporaryValue = "\n";

		// Checks fruit names according to given value.

		for (int j = 0; j < fruitNameOnly.length; j++)
			if (command[0].equals("fruit") && fruitNameOnly[j].toLowerCase().contains(command[1].toLowerCase()))
				temporaryValue += " - " + fruitNameOnly[j] + "\n";

		System.out.println(command[1] + " is NOT found in the dictionary\n" + " Suggestions : " + temporaryValue);
	}

	private static void getFruitNames() {

		for (int i = 0; i < lengthOfFruitNamesArray; i++) {
			splitterForColon = fruits.getFruitNamesColors(i).split(":");
			fruitNameOnly[i] = splitterForColon[0]; // Just getting fruit names
													// to fruitNameOnly array
			fruitColorOnly[i] = splitterForColon[1]; // Just getting fruit
														// colors to
														// fruitColorOnly array

		}

	}

	private static String checkColorMatch() {

		String[] temp;
		String fruitsWithGivenColor = "<unknown parameter> Try color <color-name>";
		for (int i = 0; i < lengthOfFruitNamesArray; i++) {
			temp = fruitColorOnly[i].split(",");
			if (i == 0) {
				if (command[1].equalsIgnoreCase(temp[0]))
					fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" + 
											"- " + fruitNameOnly[1] + "\n" +
											"- "+ fruitNameOnly[2] + "\n" + 
											"- " + fruitNameOnly[5] + "\n";
				else if (command[1].equalsIgnoreCase(temp[1]))
					fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" + 
									"- " + fruitNameOnly[3] + "\n" +
									"- "+ fruitNameOnly[4] + "\n" + 
									"- " + fruitNameOnly[5] + "\n" +
									"- " + fruitNameOnly[6] + "\n";
				else if (command[1].equalsIgnoreCase(temp[2]))
					fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" +
											"- " + fruitNameOnly[2] + "\n";
			} else if (i == 2) {
				if (command[1].equalsIgnoreCase(temp[0]))
					fruitsWithGivenColor = "- " + fruitNameOnly[1] + "\n" + 
											"- " + fruitNameOnly[2] + "\n";
				else if (command[1].equalsIgnoreCase(temp[1]))
					fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" + 
											"- " + fruitNameOnly[2] + "\n";
				else if (command[1].equalsIgnoreCase(temp[2]))
					fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" + 
											"- " + fruitNameOnly[1] + "\n" + 
											"- "+ fruitNameOnly[2] + "\n" +
											"- " + fruitNameOnly[5] + "\n";
			} else if (i == 4) {
				if (command[1].equalsIgnoreCase(temp[1]))
					fruitsWithGivenColor = "-" + fruitNameOnly[4];
			} else if (i == 3 || i == 6) {

				if (command[1].equalsIgnoreCase(temp[0]))
					fruitsWithGivenColor = "-" + fruitNameOnly[3] + "\n" +
											"-" + fruitNameOnly[6];

			} else if (command[1].equalsIgnoreCase(temp[0]))
				fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" +
										"- " + fruitNameOnly[1] + "\n" +
										"- "+ fruitNameOnly[2] + "\n" + 
										"- " + fruitNameOnly[5] + "\n";
			else if (command[1].equalsIgnoreCase(temp[1]))
				fruitsWithGivenColor = "- " + fruitNameOnly[0] + "\n" + 
										"- " + fruitNameOnly[3] + "\n" + 
										"- "+ fruitNameOnly[4] + "\n" +
										"- " + fruitNameOnly[5] + "\n" + 
										"- " + fruitNameOnly[6] + "\n";

		}
		return fruitsWithGivenColor;

	}

	private static String getFruitColors(int index) {
		// Just getting fruit colors with given index to fruitNameOnly array

		for (int i = 0; i < lengthOfFruitNamesArray; i++) {
			splitterForComma = fruitColorOnly[i].split(",");
			if (i == 0 || i == 2)
				fruitColors[i] = "[ " + splitterForComma[0] + ", " + splitterForComma[1] + ", " + splitterForComma[2]
						+ " ]";
			else
				fruitColors[i] = "[ " + splitterForComma[0] + ", " + splitterForComma[1] + " ]";

		}
		return fruitColors[index];

	}

}
