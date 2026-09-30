package Stack;

import java.util.Stack;

public class ParenthesesChecker {

public static void main(String[] args) {
    String s="{({})]";
  
}
 static Boolean isBalanced(String s){
      Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='{'||ch=='('||ch=='['){
            st.push(ch);
          
        }else{
            if(st.size()==0) return false;
            else {
                char top= st.peek();
                if(sameStyle(top,ch)) st.push(ch);
                else return false;      
        }
    }
 }
}
static Boolean sameStyle(char a,char b){
if(a=='{' && b=='}')return true;
if(a=='(' && b==')')return  true;
if(a=='[' && b==']')return true;

}
}