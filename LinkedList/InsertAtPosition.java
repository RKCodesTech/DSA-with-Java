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

    // Insert at specific position
    public void insertAtPosition(int data, int position) {

        Node newNode = new Node(data);

        // Position 1 (Beginning)
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;

        // Move temp to (position-1)th node
        for (int i = 1; i < position - 1; i++) {

            if (temp == null) {
                System.out.println("Invalid Position");
                return;
            }

            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Display Linked List
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        InsertAtPosition list = new InsertAtPosition();

        list.insertAtPosition(10,1);
        list.insertAtPosition(20,2);
        list.insertAtPosition(30,3);

        list.display();

        list.insertAtPosition(25,3);

        list.display();
    }
}