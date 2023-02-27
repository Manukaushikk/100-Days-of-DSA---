import java.util.*;

// Write code to Check if two strings are Anagram or not

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();

        // To LowerCase
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        if (str1.length() == str2.length()) {

            char[] chararr1 = str1.toCharArray();
            char[] chararr2 = str2.toCharArray();

            Arrays.sort(chararr1);
            Arrays.sort(chararr2);

            boolean ans = Arrays.equals(chararr1, chararr2);

            if (ans) {
                System.out.println("Anagram");
            } else {
                System.out.println(" NOT Anagram");
            }
        } else {
            System.out.println(" Not Anagram");

        }
    }
}
