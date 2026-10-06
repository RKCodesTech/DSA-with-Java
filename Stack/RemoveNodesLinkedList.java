package Stack;
import java.util.*;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public class RemoveNodesLinkedList {

    public ListNode removeNodes(ListNode head) {
       Stack<ListNode> st =new Stack();
       Node temp=head;
       while(temp!=null){
        if(st.size()==0) st.push(temp);
       }
    }

    public static void main(String[] args) {

    }
}