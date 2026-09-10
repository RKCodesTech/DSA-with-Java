package Stack;
import java.util.*;
public class ReverseStackMethod1 {
  public static void main(String[] args) {
    Stack<Integer> st= new Stack<>();
    Stack<Integer> st2= new Stack<>();
    Stack<Integer> st3= new Stack<>();
       st.push(3);
    st.push(4);//store integer values in st
    st.push(6);          
    st.push(2);
    System.out.println(st);
    while(st.size()>0){
        st2.push(st.pop());   //push element in st to st2

    }
    System.out.println(st2);
    while(st2.size()>0){           
        st3.push(st2.pop());          //push element st2 to st3

    }
    System.out.println(st3);
    while(st3.size()>0){
        st.push(st3.pop());          //push back element st3 to st
    }
    System.out.println(st);
  }  
}
//time complexity - o(n)
//space Complexity - o(n)