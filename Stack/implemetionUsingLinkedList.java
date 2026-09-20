package Stack;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class MyStack {
    Node head;
    int len;

    int peek() {
        if (head == null) {
            System.out.println("stack is empty");
            return -1;
        } else {
            return head.val;
        }
    }
    int pop() {// deleteAtHead
        if (head == null) {
            System.out.println("stack is empty");
            return -1;
        } else {
            int x = head.val;
            head = head.next;
            len--;
            return x;
        }
    }
    void push(int ele) {// pushAthead
        Node temp = new Node(ele);
        if (len == 0)
            head = temp;
        else {
            temp.next = head;
            head = temp;
        }len++;
    }

    int size() {
        return len;
    }
    void display(){
Node temp=head;
while(temp!=null){
    System.out.println(temp.val);
temp=temp.next;
}
    }
}

public class implemetionUsingLinkedList {

    public static void main(String[] args) {
MyStack st=new MyStack();
st.push(10);
st.push(20);st.push(30);st.push(40);st.push(50);
st.display();
    }
}
