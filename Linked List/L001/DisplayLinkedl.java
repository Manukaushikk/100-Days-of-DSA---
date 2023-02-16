public class DisplayLinkedl {

    public class Construction {

        private static class Node {
            int data;
            Node next;

            Node() {
                data = 0;
                next = null;
            }

            Node(int data) {
                this.data = data;
            }

            Node(int data, Node next) {
                this.data = data;
                this.next = next;
            }
        }

        private static class LinkedList {
            private Node head, tail;
            private int size;

            LinkedList() {
                head = tail = null;
                int size = 0;
            }

            public void addfirst(int val) {
                Node node = new Node(val);
                if (this.size == 0) {
                    this.head = this.tail = node;
                } else {
                    node.next = this.head;
                    this.head = node;
                }
                this.size++;

            }

            public int size() {
                return size;
                // write code here
            }

            public void display() {
                if (this.size == 0)
                    return;
                Node curr = this.head;

                while (curr != null) {
                    System.out.println(curr.data + "");
                    curr = curr.next;

                }
                System.out.println(); // write code here
            }
        }

        public static void main(String[] args) {
            LinkedList l1 = new LinkedList();
            l1.display();
            // l1.addfirst(10); // 10
            // l1.addfirst(20); // 20 -> 10
            // l1.addfirst(30); // 30 -> 20 -> 10
        }
    }

}
