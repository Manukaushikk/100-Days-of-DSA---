import java.util.Scanner;

// Write a program to find the sum of Natural Numbers using Recursion.

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println(getNaturalNumber(n));
    }

    public static int getNaturalNumber(int n) {
        if (n == 0)
            return n;

        return n + getNaturalNumber(n - 1);
    }
}
