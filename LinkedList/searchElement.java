public class searchElement {

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

    // Search Element
    public void search(int key) {

        Node temp = head;
        int position = 1;

        while (temp != null) {

            if (temp.data == key) {
                System.out.println("Element Found at Position : " + position);
                return;
            }

            temp = temp.next;
            position++;
        }

        System.out.println("Element Not Found");
    }

    // Display
    public void display() {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {

        SearchElement list = new SearchElement();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.display();

        list.search(30);
        list.search(100);
    }
}
searching