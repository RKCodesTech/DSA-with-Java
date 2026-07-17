public class DeleteLastNode {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    // Delete last node
    public void deleteLast() {

        // Case 1: Empty list
        if (head == null) {
            System.out.println("Linked List is empty.");
            return;
        }

        // Case 2: Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        // Case 3: More than one node
        Node temp = head;

        // Move to second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Delete last node
        temp.next = null;
    }

    // Display Linked List
    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DeleteLastNode list = new DeleteLastNode();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteLast();

        System.out.println("After Deletion:");
        list.display();
    }
}