package Stack;
import java.util.Stack;

 public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;    // this loop'll help the array two times 

            while (!st.isEmpty() && st.peek() <= arr[idx]) {
                st.pop(); //pop util stack have small elements than arr[idx]
            }

            if (i < n) {
                if (st.isEmpty()) {
                    nge[idx] = -1;    //if stack is empty
                } else {
                    nge[idx] = st.peek();   //store peek of stack at nge at index idx
                }
            }

            st.push(arr[idx]);   //push the current element in stack
        }

        return nge;
    }
    public static void main(String[] args) {
        
    }
}
//SC  O(n)	Output array and stack use linear space
//TC O(n)	Each element is pushed and popped at most once