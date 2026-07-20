class DeleteFirstNode {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void deleteFirst() {
        if (head == null) {
            System.out.println("List is Empty");
        } else {
            head = head.next;
        }
    }

    public static void main(String[] args) {

        DeleteFirstNode list = new DeleteFirstNode();

        list.head = new Node(10);
        list.head.next = new Node(20);
        list.head.next.next = new Node(30);

        list.deleteFirst();
    }
}