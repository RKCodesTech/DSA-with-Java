package Stack;
import java.util.Stack;
public class StockSpanProblem {
    public class Pair {        // class help to push both value and index
        int val;
        int idx;
        Pair(int val, int idx) {  
            this.val = val;
            this.idx = idx;
        }
    }
    public int[] calculateSpan(int[] arr) { //method with return type
        int n = arr.length; 
      int[] span = new int[n]; //span arr
        if (n == 0) return span;
        span[0] = 1; //push 1 for 0th index
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(arr[0], 0)); // pushed pair for 0th index
        for (int i = 1; i < n; i++) {//started loop from 1 to length of array
            while (st.size() > 0 && st.peek().val <= arr[i]) { 
                st.pop(); 
            }
            if (st.size() == 0) {
                span[i] = i + 1; //becuase count span even if its one [2,4,68,,38,65] for ex= here 4 count as one
            } else {
                span[i] = i - st.peek().idx; //otherwise store subtract the index for ex= if peek is 65 and index is  4-2 =2;
            }
            st.push(new Pair(arr[i], i)); // then push new pair in stack
        }
        return span;
    }
}

