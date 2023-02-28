import java.util.Scanner;

// Write the code to for Armstrong number

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int origNum, rem;
        int res = 0;

        origNum = n;

        while (origNum != 0) {
            rem = origNum % 10;
            res += Math.pow(rem, 3);
            origNum /= 10;
        }
        if (res == n) {
            System.out.println(n + " " + "Armstrong Number");
        } else {
            System.out.println(n + " " + " Not a Armstrong Number");
        }
    }
}
