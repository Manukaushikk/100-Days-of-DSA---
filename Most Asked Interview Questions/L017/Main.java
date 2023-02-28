import java.util.Scanner;

// Write a code to find an Automorphic number

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        String str1 = Integer.toString(n);

        int l1 = str1.length();

        int square = n * n;

        String str2 = Integer.toString(square);
        int l2 = str2.length();

        String str3 = str2.substring(l2 - l1);

        if (str1.equals(str3)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not a Automorphic Number");
        }
    }

}
