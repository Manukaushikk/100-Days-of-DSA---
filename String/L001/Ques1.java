import java.util.Scanner;

// Pallindrome Strings checking
public class Ques1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        PrintAllPallindromeStrings(str);

    }

    public static void PrintAllPallindromeStrings(String str) {
        for (int sidx = 0; sidx < str.length(); sidx++) {
            for (int eidx = sidx + 1; eidx <= str.length(); eidx++) {
                String ss = str.substring(sidx, eidx);
                if (isPallindrome(ss)) {
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPallindrome(String str) {
        int left = 0, right = str.length() - 1;

        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;

            }
            left++;
            right--;
        }
        return true;

    }

}
