package Stack;
import java.util.*;
public class deleteNode {
public static void main(String[] args) {
    Stack<Integer> st =new Stack<>();
    Stack<Integer> st2=new Stack<>();
    int index=3;
    st.push(3);
    st.push(4);//store integer values in st
    st.push(6);          
    st.push(2);
    while(st.size()>index){ //i
        st2.push(st.pop());

    }
    st.pop();
    while(st2.size()>0){
        st.push(st2.pop());
    }
    System.out.println(st);
}   
}
