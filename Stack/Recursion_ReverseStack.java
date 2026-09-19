package Stack;

import java.util.Stack;

public class Recursion_ReverseStack {

    public static void reverse(Stack<Integer> st) {

        if (st.size() <= 1)
            return;

        int top = st.pop();

        reverse(st); // magic: recursion have to remmeber it

        pushAtBottom(st, top);

        System.out.println("Reversed Stack: " + st);
    }

    public static void pushAtBottom(Stack<Integer> st, int element) {

        if (st.size() == 0) {
            st.push(element); 
            return;
        }

        int top = st.pop();

        pushAtBottom(st, element);

        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        System.out.println("Original Stack: " + st);

        reverse(st);
    }
}