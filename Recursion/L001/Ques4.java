import java.util.Scanner;

public class Ques4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerlinear(x, n));
    }

    public static int powerlinear(int x, int n) { // x ^ n
        if (n == 0)
            return 1;
        return x * powerlinear(x, n - 1);
    }

}
// 2*2*2*2*2