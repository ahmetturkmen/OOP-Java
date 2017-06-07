package tr.ahmetturkmen.HW5;


import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by ahmetturkmen on 3/14/2017.
 */
public class Main {
    private static Passenger[] pssngrFromTxt = new Passenger[50];
    //Since there are 28 passengers, I defined its length to 50 to get all passengers from passengers.txt file
    // The length of this array might change according to number of passengers
    private static int numberOfRows = 0;
    private static Travel[] travels = new Travel[50];

    /* I created lenght of 50 but increment numberOfRows variable when I read the data from
    travels.txt file because numberOfRows specify the number of travels that we need to check in for loop
     The length of travels  array must change according to instances of travels.txt file
     For instance, if there are 20 row in "travels.txt" file it must be equalized to 20.
     Otherwise, program will give error.*/

    private static int indexOfPassenger = 0;
    private static Scanner read = new Scanner(System.in);

    public static void main(String[] args) {

       /* Indeed, we are reading data from files we can do either
          try/catch block  or we can use "throws IOException" for main method to prevent unwanted errors

       */

        int option = 0;
        int innerOption;

        copyPssngrsToArray();
        copyTravelsToArray();

        while (option != 4) {
            System.out.print("MENU \n" + "1: Buy Ticket \n" +
                    "2:Cancel Ticket\n" + "3:List Travels \n" + "4:Exit");

            innerOption = read.nextInt();
            if (innerOption == 1)
                buyTicket();

            if (innerOption == 2)
                cancelTicket();

            if (innerOption == 3)
                listTravels();

            if (innerOption == 4)
                System.exit(0);
        }

    }



    private static void copyPssngrsToArray() {
        // The first step we have to do is copying passengers to passengers array from passengers.txt file
        // To do that I moved passengers.txt file to project folder's package.

        // note that the path of the txt files must be defined as I did below.Please define its path like this
        // if files are in Desktop of Computer implement following
        // please just change <user-name> to your machine's user name below and put txt files to Desktop

  /*        --->   IMPORTANT !!!!!!!!!!!!!!!!!!!IMPORTANT!!!!!!!!!!!!IMPORTANT!! <----------

          C:/Users/<user-name>/Desktop/<file-name>.txt (for windows systems)
         

  */

        // if those path method not applied program can give error, hence please implement them properly.


        try {
            Scanner sc = new Scanner(Paths.get("C:/Users/<user-name>/Desktop/passengers.txt"));
            while (sc.hasNextLine()) {
                pssngrFromTxt[indexOfPassenger] = new Passenger("", "", "");
                pssngrFromTxt[indexOfPassenger].setID(sc.next());
                pssngrFromTxt[indexOfPassenger].setName(sc.next());
                pssngrFromTxt[indexOfPassenger].setSurname(sc.next());
                indexOfPassenger++;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void copyTravelsToArray() {
        //Similar procedur applied for travels.txt file

        for (int i = 0; i < travels.length; i++)
            travels[i] = new Travel(50);

        // At this point,all travels' capacity set to 50 however below in try/catch block, the capacity is redesigning
        // according to values in given file which is travels.txt

        try {
            Scanner sc = new Scanner(Paths.get("C:/Users/<user-name>/Desktop/travels.txt"));
            while (sc.hasNext()) {
                // Since the type of variable is int in travels.txt, I used hasNextInt().
                travels[sc.nextInt()].setCapacity(sc.nextInt());
                numberOfRows++;
            }
        } catch (IOException e) {

        }

    }

    private static void buyTicket() {

        System.out.println("Passenger Id:");
        String idOfPassenger = read.next();
        System.out.println("Travel index");
        int travelIndex = read.nextInt();

        if(travelIndex>numberOfRows)
            System.out.println("There is no travel which has " + travelIndex + " index.");
        else
        if (travels[travelIndex].getCapacity() == travels[travelIndex].getPsgCount())
            System.out.println("The travel is FULL.");
        else
            for (int i = 0; i < indexOfPassenger; i++) {
                if (pssngrFromTxt[i].getID().equals(idOfPassenger))
                    travels[travelIndex].addPassenger(pssngrFromTxt[i]);

            }

    }

    private static void cancelTicket() {
        System.out.println("Passenger Id:");
        String idOfPassenger = read.next();
        System.out.println("Travel index");
        int travelIndex = read.nextInt();
        travels[travelIndex].deletePassenger(idOfPassenger);

    }

    private static void listTravels() {

        for (int i = 0; i < numberOfRows; i++) {
            System.out.println(i+"."+travels[i].toString());
            if (!travels[i].getPassengers().equals("")) {
                travels[i].printPassengers();

            }
        }
    }
}




