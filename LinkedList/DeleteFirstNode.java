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

    // Insert at End
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Delete First Node
    public void deleteFirst() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        head = head.next;
    }

    // Display
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

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Before Deletion:");
        list.display();

        list.deleteFirst();

        System.out.println("After Deletion:");
        list.display();
    }
}