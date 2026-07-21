public class searchElement {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    Node head;

    void insert(int data) {

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

    void search(int key) {

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

    public static void main(String[] args) {

        SearchElement list = new SearchElement();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.search(20);
    }
}