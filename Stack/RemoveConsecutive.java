package Stack;

import java.util.Stack;

import string.reversed_str;

public class RemoveConsecutive {
 
    public static void main(String[] args) {
        String s="aaaabbbbccccdddss";
        Stack<Character> st =new Stack<>();
        Stack<Character> st2 =new Stack<>();
        
        for(int i=0;i<=s.length();i++){
            char ch=s.charAt(i);
           if(st.peek()!=ch||st.empty()){
            st.push(ch);
           }else{
            continue;
           }

        }
       
    }
}
