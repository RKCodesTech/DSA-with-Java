package Stack;   //leetocde 2487
import java.util.Stack;
//problem
//Input: head = [5,2,13,3,8]
// Output: [13,8]
// Explanation: The nodes that should be removed are 5, 2 and 3.
// - Node 13 is to the right of node 5.
// - Node 13 is to the right of node 2.
// - Node 8 is to the right of node 3.

class ListNode {  //Node creation 
    int val;
    ListNode next; 
    ListNode(int val) {
        this.val = val;
    }
}
public  class RemoveNodesLinkedList {       //main class
    public static ListNode removeNodes(ListNode head) {        // function where head is i/p
   Stack<ListNode> st =new Stack<>();        //stack creation 
   ListNode temp=head;         //basic linkedlist traverse
   while(temp!=null){             // traverse
    while(!st.empty()&&st.peek().val<temp.val){     // check if peek(top of stack) < temp(current) and stack should not empty
        st.pop(); //   pop until satisfies the conditions
    }
    st.push(temp);         // otherwise always push
temp=temp.next;            // traverse
   }
   ListNode newhead =null;     // create newhead to create linkedlist using stack so that st element can have address null and to continue
   while(!st.empty()){      //base case
    ListNode Node =st.pop(); // keep current poped element in node suppose node is 3
    Node.next=newhead;  // now connect it with new node means( 3.next->null)
   newhead=Node;      // then make newhead as node to countiue 
   }
   return newhead;        // because funciton is returing the node 
    }
    public static void main(String[] args) {
       ListNode head =new ListNode(3);         //create linkedlist 
       head.next =new ListNode(39);
    head.next.next=new ListNode(5);
        ListNode result = removeNodes(head);        // store updated head in it  lineno.28
        while(result!=null){
            System.out.println(result.val);   //display list
            result=result.next;
        }
}
}

//TC o(n)
//SC o(n)