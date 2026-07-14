
class Node{
    int data;
    Node  Next;
    public Node(int data){
        this.data=data;
    }
}
public class createlinkedlist {
   public static void main(String[] args) {
    Node head= new Node(1);
    Node n1=new Node(2);
    Node n2= new Node(3);
     head.Next=n1;
     n1.Next=n2;
     Node temp = head;
     while(temp!=null){
        System.out.println(temp.data);
        temp=temp.Next;
     }
   } 
}
