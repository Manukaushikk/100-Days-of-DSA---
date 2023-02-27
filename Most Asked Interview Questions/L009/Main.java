// Write code Check if the given string is Palindrome or not

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        String reverse = "";
        str = str.toLowerCase();

        for (int i = str.length() - 1; i >= 0; i--)
            reverse = reverse + str.charAt(i);

        if (str.equals(reverse))
            System.out.println("Pallindrome");
        else
            System.out.println(" Not Pallindrome");
    }
}
