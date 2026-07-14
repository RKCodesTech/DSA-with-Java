
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}public class insertAtBegin {
    public static void main(String[] args) {

        Node head=new Node(10);
        Node n1 =new Node(34);
        Node n2=new Node(4);
        Node n3=new Node(234);
        head.next=n2;
        n1.next=n2;
        n2.next=n3;
        //inserting new Node;
        Node newNode=new Node(1);
            newNode.next=head; //Before changing head, you already saved the old head inside newNode.next.
            head=newNode;
        Node temp =head;
        while(temp!=null){
            System.out.println(temp.next);
            temp=temp.next;
        }
    }
} 
    

