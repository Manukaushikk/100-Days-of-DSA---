import java.util.Scanner;

// Print zigZag

public class Ques6 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        pzz(n);
    }

    public static void pzz(int n) {
        if (n == 0)
            return;
        if (n == 1) {
            System.out.print("1" + " " + "1" + " " + "1" + " ");
            return;
        }
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
        pzz(n - 1);
        System.out.print(n + " ");
    }
}
