import java.util.Scanner;

// Write code of  Perfect number

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sum = 0;
        for (int i = 1; i < n; i++) {
            if (n % i == 0)
                sum = sum + i;
        }
        if (sum == n) {
            System.out.println("Perfect Number");
        } else {
            System.out.println("Not a Perfect Number");

        }
    }
}
