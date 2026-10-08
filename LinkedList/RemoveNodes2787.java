public class RemoveNodes2787 {
    static class Node {
        int val;
        Node next;
        Node(int val) {
            this.val = val;
        }
    }
    public Node removeNode(Node head) {
        Node prev=null;
        Node current =head;
        Node next=null;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
      head=prev;
      
      Node max =head;
      current=head;
      while(current!=null &&current.next!=null){
        if(current.next.val<max.val){
            current.next=current.next.next;

        } else{
            current=current.next;
            max=current;
        }
      }
    }
    public static void main(String[] args) {
        Node head = new Node(2);

    }
}