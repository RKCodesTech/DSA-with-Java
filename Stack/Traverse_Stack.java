package Stack;
import java.util.Stack;;
public class Traverse_Stack {
public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    Stack<Integer>  st2=new Stack<>();  
    st.push(3);
    st.push(4);
    st.push(6);
    st.push(2);
    System.out.println(st);
    while(st.size()>0){
        int top=st.pop();
        System.out.println(top);
        st2.push(top);
    }
    while(st2.size()>0){ 
        System.out.println(st); 
st.push(st2.pop());

    }

}    
}
