package homework1;

/**
 * Created by Dim on 14.02.2016.
 */

    //Find which one of two numbers is closer to 10.
public class Distance {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 11;

        if (Math.abs(num1-10) < Math.abs(num2-10)){
            System.out.println(num1);
        }else{
            System.out.println(num2);
        }
    }
}
