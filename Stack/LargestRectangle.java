//leetcode 
package Stack;

import java.util.Stack;

public class LargestRectangle {
   
    public int largestRectangleArea(int[] heights) {
              int n= heights.length();
        int[] nse =new int[n];
        int[] pse =new int[n];
        Stack<Integer> st= new Stack;
        nse[n-1]=n;
st.push(heights[n-1])
        for(int i= n-2;i>0 ;i--){
            while(st.size()>&&st.peek()>=hieghts[i])st.pop();
            if(st.size()=0) nse[i]=n; //-1 nahi karege calculation ki vajah se
        }  
    }
}

