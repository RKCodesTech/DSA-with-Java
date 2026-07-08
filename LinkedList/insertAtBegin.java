package LinkedList;
public class insertAtBegin {
public class node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}


    public static void main(String[] args) {

        Node head = new Node(10);
        Node n1 = new Node(20);
        Node n2 = new Node(30);//node

        head.next = n1; 
        n1.next = n2;

        // Insert at Beginning
        Node newNode = new Node(5);

        newNode.next = head;
        head = newNode;

        // Display
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
} 
    

