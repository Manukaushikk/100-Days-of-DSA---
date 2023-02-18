import java.util.Stack;

public class StackIntro {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        System.out.println(st + "-> size :" + st.size());
        st.push(10);

        System.out.println("TME: " + st.peek());
        st.push(20);

        System.out.println("TME: " + st.peek());
        st.push(30);

        System.out.println("TME: " + st.peek());

        System.out.println(st + "-> size : " + st.size());

        System.out.println("TME: " + st.peek());
        System.out.println("removed ele : " + st.pop() + "status :" + st);
        st.push(40);
        st.push(50);
        st.push(60);
        System.out.println(st);

        for (int ele : st) {
            System.out.print(ele + "->");
        }
        System.out.println();
    }

}
