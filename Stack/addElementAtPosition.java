package Stack;
import java.util.Stack;
public class addElementAtPosition {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        Stack<Integer> st2=new Stack<>();
        int index=3;
        st.push(4);
        st.push(3);
        st.push(6);
        st.push(8);
        while(st.size()>index){   //run loop until it reach at the index
           st2.push( st.pop());   //pop from st and push in st2
        }st.push(10);    //now push new element in st
        while(st2.size()>0){   //run loop until st2 become empty 
            st.push(st2.pop());//again fill back all elements back in st2 to st
        }
        System.out.println(st);
    }
}
//TimeComplexity - o(n)
//spacecomplexity-o(n)


