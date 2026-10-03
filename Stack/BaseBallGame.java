package Stack;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
      String arr[] = {"4", "3", "C", "D", "+"};
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
      System.out.println("prevous String");
      for (String s : arr) {
        System.out.print(s+" ");
      }
      System.out.println();
      System.out.println("after game");
      System.out.println(st);
    }
}
