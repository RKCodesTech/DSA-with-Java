class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}

public class searchElement {

    public static void main(String[] args) {

        int key = 234;

        Node head = new Node(10);
        Node n1 = new Node(34);
        Node n2 = new Node(4);
        Node n3 = new Node(234);

        head.next = n1;
        n1.next = n2;
        n2.next = n3;

        Node temp = head;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Element Found");
                return;
            }

            temp = temp.next;
        }

        System.out.println("Element Not Found");
    }
}