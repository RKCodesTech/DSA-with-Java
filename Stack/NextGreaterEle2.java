package Stack;
//leetcode 503

import java.util.Stack;

public class NextGreaterEle2 {
public int[] nextgreaterelement2(int[] arr){
    int n=arr.length;
    int [] nge= new int[n];
    Stack<Integer> st=new Stack<>();
    for(int i =n-1;i>=0;i--){
        st.push(arr[i]);
    }
    for(int i=n-1;i>=0;i--){
        while (st.size()>0 &&st.peek()<=arr[i]) {
            st.pop();
        }
        if(st.isEmpty()){
            nge[i]=-1;
        }else{
            nge[i]=st.peek();
        }
        st.push(arr[i]);
    }
    return nge;
}
    public static void main(String[] args) {
        
    
}
}
