import java.util.Scanner;

// Write a code to reverse a number

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int number = scn.nextInt();
        int reverse = 0;

        String str = "";

        while (number != 0) {
            int pick_last = number % 10;
            str = str + Integer.toString(pick_last);
            number = number / 10;
        }
        System.out.println(str);
    }

}
