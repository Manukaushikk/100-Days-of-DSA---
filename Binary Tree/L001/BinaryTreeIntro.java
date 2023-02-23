import java.util.*;

public class BinaryTreeIntro {
    public static class Node {
        int data;
        Node lchild;
        Node rchild;

        Node(int val) {
            data = val;
            lchild = rchild = null;
        }
    }

    public static class Pair {
        Node node;
        int state;

        Pair(Node node) {
            this.node = node;
        }
    }

    public static Node construct(Integer arr[]) {
        Node root = new Node(arr[0]);
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root));

        int idx = 1;
        while (st.size() > 0) {
            Pair tpair = st.peek();
            if (tpair.state == 0) {
                Integer vl = arr[idx++];
                if (vl != null) {
                    Node newNode = new Node(vl); // Create
                    tpair.node.lchild = newNode;// Connect to left
                    st.push(new Pair(newNode)); // Push to Stack
                }
                tpair.state++;
            } else if (tpair.state == 1) {
                Integer vl = arr[idx++];
                if (vl != null) {
                    Node newNode = new Node(vl); // Create
                    tpair.node.rchild = newNode;// Connect to right
                    st.push(new Pair(newNode)); // Push to Stack
                }
                tpair.state++;

            } else { // Both states
                st.pop();

            }
        }

        return root;

    }

    public static void display(Node node) {
        if (node == null)
            return;
        if (node.lchild != null)
            System.out.print(node.lchild.data);

        System.out.print(" <- " + node.data + " -> ");

        if (node.rchild != null)
            System.out.print(node.rchild.data);

        System.out.println();
        display(node.lchild);
        display(node.rchild);
    }

    public static void main(String[] args) {
        Integer arr[] = { 10, 20, 40, null, null, 50, 70, null, null, null, 30, null, 60, null, null };
        Node root = construct(arr);
        display(root);
    }
}
