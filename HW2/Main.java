
import java.util.Scanner;

/**
 * Created by ahmetturkmen on 2/7/17.
 */
public class Main {
    private static Vehicle[] cars = new Vehicle[21];
    private static int index, indexOfAddedCar=0,counter = 0;
    private static Scanner read = new Scanner(System.in);
    private static String plateForExists;

    public static void main(String[] args) {
        int option = 0;
        int totalMoney = 0;

        for (int j = 0; j < cars.length; j++) {
            cars[j] = new Vehicle();
        }

        while (option != 3) {
            System.out.printf("Choose:\n" +
                    "(1) Car Enter\n" +
                    "(2) Car Exit\n" +
                    "(3) Terminate");
            option = read.nextInt();
            if (option == 1) {
                while (indexOfAddedCar < cars.length + 1) {
                    if (counter == 20) {
                        System.out.println("There is NO room in the parking area");
                        break;
                    }
                    counter++;
                    System.out.println("Enter vehicle's plate ");
                    cars[indexOfAddedCar].plateNumber = read.next();
                    System.out.println("Enter vehicle type");
                    cars[indexOfAddedCar].type = read.next();
                    System.out.println("Enter vehicle's enterance hour");
                    cars[indexOfAddedCar].entranceHour = read.nextInt();
                    indexOfAddedCar++;
                    break;
                }
            }

            if (option == 2) {
                System.out.printf("Enter exiting vehicle's plate : ");
                plateForExists = read.next();
                if (!checkForExistence(plateForExists)) {
                    System.out.println("There is no such a car");
                    displayCars();
                    System.exit(0);
                } else
                    System.out.println("Enter existing hour");
                cars[getIndexNumber(plateForExists)].existingHour = read.nextInt();
                cars[getIndexNumber(plateForExists)].calculatePayment(cars[getIndexNumber(plateForExists)].type);
                totalMoney += cars[getIndexNumber(plateForExists)].calculatePayment(cars[getIndexNumber(plateForExists)].type);
                System.out.println("The vehicle pays "
                        + cars[getIndexNumber(plateForExists)].calculatePayment(cars[getIndexNumber(plateForExists)].type)
                        + " TL");
                updateCar(getIndexNumber(plateForExists));

            }
            // displayCars();         // IF YOU WANT TO DISPLAY THE CARS IN EVERY TIME ENABLE THIS METHOD

        }
        System.out.println("The Total Money Earned  is " + totalMoney + " TL");

    }


    private static int getIndexNumber(String plateNumber) {
        for (int i = 0; i < counter; i++) {
            if (plateNumber.equals(cars[i].plateNumber)) {
                index = i;
            }
        }
        return index;
    }

    private static boolean checkForExistence(String plateNumber) {
        int index2 = 0;
        while (index2 < cars.length) {
            if (plateNumber.equals(cars[index2].plateNumber))
                return true;
            index2++;
        }
        return false;
    }

    private static void updateCar(int remIndex) {

        for (int i = remIndex; i < remIndex + (counter - remIndex); i++) {
            cars[i].plateNumber = cars[i + 1].plateNumber;
            cars[i].type = cars[i + 1].type;
            cars[i].entranceHour = cars[i + 1].entranceHour;
        }
        for (int i = counter; i < cars.length - counter; i++) {
            cars[i].plateNumber = "";
        }
        counter--;
        indexOfAddedCar--;

    }


    private static void displayCars() {
        System.out.println("List of Vehicles Inside");
        if (counter <= 20) {
            for (int m = 0; m < counter; m++) {
                if (!cars[m].plateNumber.equals("")) {
                    System.out.printf("%s %s %d\n", cars[m].plateNumber, cars[m].type, cars[m].entranceHour);
                }

            }
        }
    }


}
