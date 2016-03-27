package homework1;

/**
 * Created by Dim on 12.02.2016.
 */

    //Room Rental
    //Room Daily rent = $40.
    //-$20 discount for more than 3 days rent.
    //-$50 discount for more than 7 days rent.
public class RoomRental {

    public static void main(String[] args) {
        int days = 9;
        int dailyPrice = 40;

        if (days <= 3) {
            System.out.println("No discount. Total: $" + days * dailyPrice);
        } else if (days <= 7) {
            System.out.println("$20 discount. Total: $" + (days * dailyPrice - 20));
        } else {
            System.out.println("$50 discount. Total: $" + (days * dailyPrice - 50));
        }

    }
}
