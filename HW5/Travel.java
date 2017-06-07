package tr.ahmetturkmen.HW5;


/**
 * Created by ahmetturkmen on 3/14/2017.
 */
public class Travel {

    private int capacity;
    private int psgCount = 0;
    private Passenger[] passengers;


    public Travel(int capacity) {
        this.capacity = capacity;
        passengers = new Passenger[capacity];
    }

    public void addPassenger(Passenger passenger) {

        String name = passenger.getName();
        String id = passenger.getID();
        String surname = passenger.getSurname();

        if (capacity - psgCount > 0) {    // check if the capacity is proper or not, so check available space for new passengers
            passengers[psgCount] = new Passenger(id, name, surname);
            passengers[psgCount] = passenger;
            psgCount ++;
            System.out.println(passenger + " is added");
        }

    }



    public void deletePassenger(String id) {
        int i;
        for ( i = 0; i < getPsgCount() ; i++) {  // this for loop is needed to find index of passenger
            if(passengers[i].getID().equals(id))
                break;
        }
        System.out.println(passengers[i].toString()+ " is deleted");
        for (int j = i; j < getPsgCount(); j++)
            passengers[j] = passengers[j + 1];

            // after found index of the passenger shift one ahead.
            // The last one passenger's name, surname and id becomes ""
            // however I controlled it to do not display on console in listTravels method in main class.


        psgCount--;
   }



    @Override
    public String toString() {

        return "Travel " + "[" +
                "capacity = " + capacity +
                ", selledTickets = " + getPsgCount()
                + "]";

    }

    public void printPassengers() {

        for (int i = 0; i < getPsgCount(); i++)
            System.out.println(passengers[i]);


    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getPsgCount() {
        return psgCount;
    }

    public void setPsgCount(int psgCount) {
        this.psgCount = psgCount;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

}
