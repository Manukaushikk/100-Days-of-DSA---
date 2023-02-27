import java.util.Scanner;

// Write the code to find the Fibonacci series upto the nth term.

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int first = 0, second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");

            int third = first + second;
            first = second;
            second = third;
        }
    }
}
