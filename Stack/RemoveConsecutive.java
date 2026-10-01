package Stack;

import java.util.Stack;

import string.reversed_str;

public class RemoveConsecutive {
 
    public static void main(String[] args) {
        String s="aaaabbbbccccdddss";
        Stack<Character> st =new Stack<>();
        Stack<Character> st2 =new Stack<>();
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
           if(st.empty()||st.peek()!=ch){
            st.push(ch);
           }else{
            continue;
           }

        }
        while(st.size()>0){
            st2.push(st.pop());

        }
        while(st2.size()>0){
            st.push(st2.pop());
        }
        System.out.println(st);
       
    }
}

//timecomplexity o(n)
//SpaceComplexity o(n)
