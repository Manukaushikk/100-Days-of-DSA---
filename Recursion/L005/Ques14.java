// Print Subsequence

import java.util.Scanner;

public class Ques14 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();

        printSS(str, "");
    }

    public static void printSS(String qsf, String asf) {
        if (qsf.length() == 0) {
            System.out.println(asf);
            return;
        }
        char ch = qsf.charAt(0);
        String roq = qsf.substring(1);
        printSS(roq, asf + ch);
        printSS(roq, asf);
    }

}
