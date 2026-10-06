package Stack;

import java.util.Stack;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
    }
}
public  class RemoveNodesLinkedList {
    public static ListNode removeNodes(ListNode head) {
   Stack<ListNode> st =new Stack<>();
   ListNode temp=head;
   while(temp!=null){
    while(!st.empty()&&st.peek().val<temp.val){
        st.pop();
    }
    st.push(temp);
temp=temp.next;
   }
   ListNode newhead =null;
   while(!st.empty()){
    ListNode Node =st.pop();
    Node.next=newhead;
   newhead=Node;
   }
   return newhead;
    }
    public static void main(String[] args) {
       ListNode head =new ListNode(3);
       head.next =new ListNode(39);
    head.next.next=new ListNode(5);
        ListNode result = removeNodes(head);
        while(result!=null){
            System.out.println(result.val);
            result=result.next;
        }
}
}