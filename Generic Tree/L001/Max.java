
import java.util.*;

public class Max {

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

    public static int max(Node node) {
        int ans = Integer.MIN_VALUE;
        for (Node child : node.children) {
            int compare = max(child);
            ans = Math.max(compare, ans);
        }
        int actualans = Math.max(ans, node.data);
        return actualans;
    }

    public static void main(String args[]) {
        Integer arr[] = { 10, 20, null, 30, 50, null, 60, null, null, 40, null, null };
        Node root = constructGT(arr);

        System.out.println(max(root));
    }
}