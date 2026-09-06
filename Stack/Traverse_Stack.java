package Stack;
import java.util.Stack;;
public class Traverse_Stack {
public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    Stack<Integer>  st2=new Stack<>();  
    st.push(3);
    st.push(4);//store integer values in st
    st.push(6);          
    st.push(2);
    System.out.println(st);
    while(st.size()>0){
        int top=st.pop();//remove from st and store in top
        System.out.println(top);//then push that top in st2
        st2.push(top);
    }
    while(st2.size()>0){ 
        System.out.println(st);//again pop from st2 and push in st
st.push(st2.pop());

    }
}    
}
//Time Complexity
// o(n)
//space complexity
// o(n) because new stack st2 also used 
