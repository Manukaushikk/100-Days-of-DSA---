import java.util.Scanner;

public class Basic {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(N + " " + "x" + " " + i + " " + "=" + " " + N * i);
        }
    }
}
