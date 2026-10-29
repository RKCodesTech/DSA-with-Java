package Stack;
import java.util.Stack;
public class StockSpanProblem {
    public class Pair {
        int val;
        int idx;
        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }
    }
    public int[] calculateSpan(int[] arr) {
        int n = arr.length;
      int[] span = new int[n];
        if (n == 0) return span;
        span[0] = 1;
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(arr[0], 0));
        for (int i = 1; i < n; i++) {
            while (st.size() > 0 && st.peek().val <= arr[i]) {
                st.pop();
            }
            if (st.size() == 0) {
                span[i] = i + 1;
            } else {
                span[i] = i - st.peek().idx;
            }
            st.push(new Pair(arr[i], i));
        }
        return span;
    }
}
//TC -
