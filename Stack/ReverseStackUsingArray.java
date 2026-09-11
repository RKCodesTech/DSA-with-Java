package Stack;
import java.util.*;
public class ReverseStackUsingArray {
  public static void main(String[] args) {
    Stack<Integer> st=new Stack<>();
    int arr[]=new int[5];
    int i=0;
    st.push(1);
    st.push(2);
    st.push(7);
    st.push(5);
    st.push(6);
    System.out.println("old stack: "+st);
    while(st.size()>0){
       arr[i]= st.pop();
       i++;
    }
   i=0;
    while(i<arr.length){
        st.push(arr[i]);
        i++;
    }
System.out.println("Stack after Reverse "+st);
  }  
}
