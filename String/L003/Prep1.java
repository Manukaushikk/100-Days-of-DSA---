// print All Permutations of a String
public class Prep1 {
    public static void main(String[] args) {
        String str = "ABC";
        printPermutations(str, "");
    }

    public static void printPermutations(String str, String ans) {
        if (str.length() == 0) {
            System.out.println(ans + "");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            String res = str.substring(0, i) + str.substring(i + 1);

            printPermutations(res, ans + ch);
        }
    }
}
