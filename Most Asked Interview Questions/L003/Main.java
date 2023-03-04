import java.util.Scanner;

// Write a code to find Find the ASCII value of a character

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        char c = scn.next().charAt(0);

        int i = c;

        System.out.println("ASCII Value of " + c + " " + "is ->" + " " + i);
    }
}
