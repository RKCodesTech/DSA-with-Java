public class CountNodes {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Count total nodes
    public void countNodes() {

        Node temp = head;
        int count = 0;

        while (temp != null) {// will check until reach the end node
            count++;           // count wil increase how many times node apear
            temp = temp.next;
        }

        System.out.println("Total Nodes = " + count);
    }

    public static void main(String[] args) {

        CountNodes list = new CountNodes();

        // Creating Linked List
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        list.countNodes();
    }
}