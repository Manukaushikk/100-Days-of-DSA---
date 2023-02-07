// Reverse a String 

import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        for (int i = str.length(); i > 0; i--) {
            System.out.print(str.charAt(i - 1));
        }
    }
}
