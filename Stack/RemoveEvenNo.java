
import java.util.Stack;

public class RemoveEvenNo{
    public static void main(String[] args) {

        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(15);
        st.push(20);
        st.push(25);
        st.push(30);

        Stack<Integer> temp = new Stack<>();

        while (!st.isEmpty()) {
            int n = st.pop();

            if (n % 2 != 0) {
                temp.push(n);
            }
        }

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }

        System.out.println(st);
    }
}
