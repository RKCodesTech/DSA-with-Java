class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedListLenght
 {

    Node head;

    // Find Length
    public int findLength() {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Length = " + list.findLength());
    }
}