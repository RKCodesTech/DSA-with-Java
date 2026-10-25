package Stack;
import java.util.Stack;

 public class NextGreaterElement2 {
    public int[] nextGreaterElements(int[] arr) {
        int n = arr.length;
        int[] nge = new int[n];
        Stack<Integer> st = new Stack<>();

        for (int i = 2 * n - 1; i >= 0; i--) {
            int idx = i % n;

            while (!st.isEmpty() && st.peek() <= arr[idx]) {
                st.pop();
            }

            if (i < n) {
                if (st.isEmpty()) {
                    nge[idx] = -1;
                } else {
                    nge[idx] = st.peek();
                }
            }

            st.push(arr[idx]);
        }

        return nge;
    }
    public static void main(String[] args) {
        
    }
}
//SC  O(n)	Output array and stack use linear space
//TC O(n)	Each element is pushed and popped at most once