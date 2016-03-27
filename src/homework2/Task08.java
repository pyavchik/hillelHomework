package homework2;

/**
 * Created by Dim on 17.02.2016.
 */
//8. Найти все счастливые билеты от 100000 до 999999
public class Task08 {
    public static void main(String[] args) {

        int ticket = 100_000;
        int[] digits = new int[6];
        int ticketCounter = 0;

        while (ticket <= 999_999){

            int separator = ticket;
            for (int i = 0; i < 6; i++) {
                digits[i] = separator % 10;
                separator = separator / 10;
            }

            int firstThreeDigits = digits[3] + digits[4] + digits[5];
            int lastThreeDigits = digits[0] + digits[1] + digits[2];
            if (lastThreeDigits == firstThreeDigits){
                System.out.println(ticket);
                ticketCounter++;
            }

            ticket++;
        }

        System.out.println(ticketCounter + " Lucky tickets");

    }
}

