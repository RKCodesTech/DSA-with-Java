package Stack;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
      String arr[] = {"4", "3", "C", "D", "+"};
      int total=0;
      Stack <Integer> st=new Stack<>();
      for(int i=0;i<arr.length;i++){
        String s=arr[i];
        if(s.equals("C"))st.pop();
        else if(s.equals("D")) st.push(2*st.peek());
        else if(s.equals("+")) {
            int top =st.pop();
            int secondtop =st.peek();
            int sum=top+secondtop;
            st.push(top);
            st.push(sum);
        }else st.push(Integer.parseInt(s));
      }
      for (Integer score : st) {
        total+=score;
        
      }
      System.out.println(total);
    }
}
