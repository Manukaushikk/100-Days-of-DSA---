import java.util.Scanner;

// Factorial
public class Ques3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Factorial" + ":" + Factorial(n));
    }

    public static int Factorial(int n) {
        if (n == 0)
            return 1;
        return n * Factorial(n - 1);
    }
}
