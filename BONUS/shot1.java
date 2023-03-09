import java.util.Scanner;

public class shot1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fib(n));
    }

    public static int fib(int n) {
        if (n < 0)
            return n;

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);

    }
}
