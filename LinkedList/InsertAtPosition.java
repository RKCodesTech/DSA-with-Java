public class InsertAtPosition {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move to the node before the desired position
        for (int i = 1; i < position - 1; i++) {
            temp = temp.next;
        }

        // Insert the new node
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {

        InsertAtPosition list = new InsertAtPosition();

        list.insertAtPosition(10, 1);
        list.insertAtPosition(20, 2);
        list.insertAtPosition(30, 3);

        list.insertAtPosition(25, 3);

        list.display();
    }
}