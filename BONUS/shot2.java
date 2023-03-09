import java.util.Scanner;

public class shot2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        System.out.println("GCD will be :" + " " + GCD(n1, n2));
    }

    public static int GCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return GCD(n2, n1 % n2);
    }
}
