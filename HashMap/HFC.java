import java.util.HashMap;
import java.util.Scanner;

public class HFC {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(HFC(str));
    }

    public static char HFC(String str) {

        HashMap<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hm.containsKey(hm)) {
                hm.put(ch, hm.get(ch) + 1);
            } else {
                hm.put(ch, 1);
            }
        }
        int freq = 0;
        char ans = ' ';
        for (Character key : hm.keySet()) {
            if (hm.get(key) > freq) {
                freq = hm.get(key);
                ans = key;
            }
        }
        return ans;
    }

}
