import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();
        char ch = scn.next().charAt(0);

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {

                ++frequency;
            }
        }
        System.out.println(frequency);
    }
}
