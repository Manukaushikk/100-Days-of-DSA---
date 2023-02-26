
import java.util.Scanner;
// Write a code to Remove all characters from string except alphabets

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        str = str.replaceAll("[^a-zA-Z]", "");
        System.out.println(str);
    }
}
