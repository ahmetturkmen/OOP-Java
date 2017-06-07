import java.io.IOException;
import java.nio.file.Paths;

import java.util.Scanner;

public class Fruit {

	private String[] fruitNamesColors;

	public Fruit() {
		fruitNamesColors = new String[7];

	}

	public void readData() {
		int index = 0;

		/*
		 * IMPORTANT <------- FOR WINDOWS PCS-------------->
		 * 
		 * Paths.get must be used in the given format otherwise it could not
		 * read info from that input.txt file Simply write-down the path of
		 * input.txt file according to your PC. Let say that your PC info like
		 * this and input.txt file in your computer desktop 
		 * ---------------------------
		 * Your user-name inPC : dell 
		 * location of .txt file : Desktop 
		 * TXT file name : input.txt
		 * ---------------------------
		 * then the path must be "C:/Users/dell/Desktop/input.txt"
		 * 
		 * <--------------MAC OS PCS-------------------------->
		 * 
		 * /Users/dell/Desktop/input.txt (for Mac systems )
		 **** 
		 * 
		 * if those path method not applied program can give error, hence please
		 * implement them properly.***
		 */

		/*
		 * Indeed, we are reading data from files we can do either try/catch
		 * block or we can use "throws IOException" to prevent unwanted errors
		 */

		{

			try

			{
				Scanner sc = new Scanner(Paths.get("C:/Users/DELL/Desktop/input.txt")); 
				while (sc.hasNextLine()) {

					fruitNamesColors[index] = sc.nextLine();
					index++;
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public String getFruitNamesColors(int index) {
		return fruitNamesColors[index];
	}

	public int getLengthOfFruitNamesColorsArray() {
		return fruitNamesColors.length;
	}

}
