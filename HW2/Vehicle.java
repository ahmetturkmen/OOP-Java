
/**
 * Created by ahmetturkmen on 2/7/17.
 */
public class Vehicle {

    public String plateNumber;
    public String type;
    public int entranceHour;
    public int existingHour;


    public int calculatePayment(String type) {
        int cost = 0;
        if (type.equals("large")) {
            if ((existingHour - entranceHour) > 2) {
                cost = 7 + (((existingHour - entranceHour) - 2) * 3);

            } else

                cost = 7;
        }
        if (type.equals("medium")) {
            if ((existingHour - entranceHour) > 2) {
                cost = 6 + (((existingHour - entranceHour) - 2) * 2);

            } else
                cost = 6;

        }
        if (type.equals("small")) {
            if ((existingHour - entranceHour) > 2) {
                cost = 5 + (((existingHour - entranceHour) - 2) * 1);

            } else
                cost = 5;

        }

        return cost;
    }
}
