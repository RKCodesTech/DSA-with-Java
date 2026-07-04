// package LinkedList;
// class Node{
//     int data;
//     Node Next;
//     Node(int data){
//         this.data=data;
//         this.Next=null;
//     }
// }

// public class linkedlist1 {
//     public static void main(String[] args) {
//         Node head=new Node(1);
//         Node d2=new Node(2);
//         Node d3=new Node(3);

//         head.Next=d2;
//         d2.Next=d3;
//         int temp=head;
//         while (temp != null) {
//     System.out.print(temp.data + " -> ");
//     temp = temp.next;
// }
//     }
// }

package LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){ 
        this.data=data;
        this.next=null;
    }

}
public class linkedllist1{
    public static void main(String[] args) {
        
    
    Node n1=new Node(0);
    Node n2=new Node(1);
    Node n3=new Node(2);
    Node n4=new Node(3);
    
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;

        Node temp=n1;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
        

    }
}