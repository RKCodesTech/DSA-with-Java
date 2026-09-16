import java.util.Stack;

public class RecursionElementAtBottom {

    public static void pushStackBottom(Stack<Integer> st, int ele) {

        if (st.size() == 0) {
            st.push(ele);
            return;
        }

        int top = st.pop();

        pushStackBottom(st, ele);

        st.push(top);
    }

    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(3);
        st.push(4);
        st.push(7);
        st.push(0);

        int ele = 5;

        pushStackBottom(st, ele);

        System.out.println(st);
    }
}