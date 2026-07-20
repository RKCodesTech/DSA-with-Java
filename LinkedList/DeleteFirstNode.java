public class DeleteFirstNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("NULL");
    }

    public static void main(String[] args) {

        DeleteFirstNode list = new DeleteFirstNode();

        // Creating the linked list manually
        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);
        list.head.next.next.next = new Node(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteFirst();

        System.out.println("After Deletion:");
        list.display();
    }
}