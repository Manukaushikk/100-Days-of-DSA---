import java.util.*;

public class BlancedBrackets {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String exp = scn.nextLine();

        System.out.println(duplicatesBrackets(exp));
    }

    public static boolean duplicatesBrackets(String exp) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if (ch == ')') {
                if (st.peek() == '(') {
                    return true;
                } else {
                    while (st.peek() != '(') {
                        st.pop();
                    }
                    st.pop();
                }
            } else if (ch == ' ') {
                continue;
            } else {
                st.push(ch);
            }
        }
        return false;
    }
}
