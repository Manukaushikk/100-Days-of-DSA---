import java.util.Scanner;

// Write a code to find the factorial of a number

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        if (n >= 0) {
            System.out.println(getfact(n));
        } else {
            System.out.println("Not a factorial");
        }
    }

    public static int getfact(int n) {
        if (n == 1 || n == 0)
            return 1;

        return n * getfact(n - 1);
    }
}
