package tr.ahmetturkmen.HW5;

/**
 * Created by ahmetturkmen on 3/14/2017.
 */
public class Passenger {

    private String name;
    private String surname;
    private String ID;


    public Passenger(String ID, String name, String surname){
        this.ID=ID;
        this.name=name;
        this.surname=surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {

        String toString= "Passenger [name = " + name + ", "+"surname = "
                        +surname +", "+"id= "+getID() +"]";
        return toString;
    }


}
