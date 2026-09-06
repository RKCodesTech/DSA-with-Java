package Stack;
import java.util.Stack;
public class BasicStack {
    public static void main(String[] args) {   
    Stack<String> st=new Stack<>();
    st.push("riya");
    st.push("yashvi");
    st.push("pari");
    st.push("aarav");
    st.push("ansh");
    st.push("kittu");
    // System.out.println(st.size());
    //     System.out.println(st);
        System.out.println(st.pop());
        System.out.println(st.peek());
}
    }
