package Stack;
import java.util.Stack;
public class ElementAtPosition {
    public static void main(String[] args) {
        
    Stack<Integer> st= new Stack<>();
    Stack<Integer> st2= new Stack<>();
    int index=3;
    st.push(6);//0
         st.push(1);//1
     st.push(2);//2
     
     st.push(4);//3
     while(index<st.size()){
       st2.push(st.pop());
     }
    System.out.println(st.peek());
    
    
    
    }
}
