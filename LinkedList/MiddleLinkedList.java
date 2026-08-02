class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class MiddleLinkedList {

    Node head;

    public Node findMiddle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;          // 1 step
            fast = fast.next.next;     // 2 steps
        }

        return slow;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);     //.next.next will store other address of next from header
        list.head.next.next.next = new Node(40);
        list.head.next.next.next.next = new Node(50);

        Node middle = list.findMiddle();

        System.out.println("Middle Node: " + middle.data);
    }
}