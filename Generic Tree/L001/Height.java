
import java.util.*;

public class Height {

    private static class Node {
        int data;
        ArrayList<Node> children;

        Node(int val) {
            data = val;
            children = new ArrayList<>();
        }
    }

    public static Node constructGT(Integer arr[]) {
        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);
        int idx = 1;
        while (idx < arr.length) {
            Integer vl = arr[idx];
            if (vl == null) {
                st.pop();
            } else {
                Node node = new Node(vl);
                Node par = st.peek();
                par.children.add(node); // link
                st.push(node);
            }
            idx++;
        }
        return root;
    }

    public static int height(Node node) {
        return 0;

    }

    public static void main(String args[]) {
        Integer arr[] = { 10, 20, null, 30, 50, null, 60, null, null, 40, null, null };
        Node root = constructGT(arr);

        System.out.println(height(root));
    }
}