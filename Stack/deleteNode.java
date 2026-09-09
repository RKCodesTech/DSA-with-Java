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
    while(st.size()>index){ //dlt element until it reaches the index
        st2.push(st.pop());//now dlt from st and push into st

    }
    st.pop();//dlt top element
    while(st2.size()>0){ // run loop until st2 become empty
        st.push(st2.pop());//dlt from st2 and push into st
    }
    System.out.println(st);
}   
}
//TC- o(n)
//SC- o(n)