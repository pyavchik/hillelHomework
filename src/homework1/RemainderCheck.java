package homework1;

/**
 * Created by Dim on 14.02.2016.
 */
public class RemainderCheck {
    public static void main(String[] args) {
        int num1 = 8;
        int num2 = 3;
        int remainder = num1 % num2;

        if (remainder == 0){
            System.out.println("num1 divided by num2 with no remainder");
        }else{
            System.out.println("num1 divided by num2 with remainder " + remainder);
        }
    }
}
