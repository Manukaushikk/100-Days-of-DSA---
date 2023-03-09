import java.util.Scanner;

public class shot3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(isPallindrome(str));

    }

    public static boolean isPallindrome(String str) {
        String rev = reverse(str);
        if (str.equals(rev)) {
            return true;
        }
        return false;
    }

    public static String reverse(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        return str.charAt(str.length() - 1) + reverse(str.substring(0, str.length() - 1));
    }

}
