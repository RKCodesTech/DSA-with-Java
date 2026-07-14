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
//first we create a class which will take input paramenter a data 
//and then create a variable Node next; which will hold address (refrence of oblject )
//then create a objects of that node class like-
// head(1);
// d2(2);
// d3(3);
//address of next node into current node like-
// head.next=d2;//address of next node
// d2.next=d3;
// then storing Node temp=head
// then from while loop checkin that temp is null or not if no then
//print temp.data it means head.data=1
// then temp=temp.next; means temp=head.next; -> temp=d2;
// coutinue until temp becomes null;