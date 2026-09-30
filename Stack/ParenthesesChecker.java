package Stack;

import java.util.Stack;

public class ParenthesesChecker {

public static void main(String[] args) {
    String s="{({})]";
    isBalanced(s);
    if (isBalanced(s)){
        System.out.println("parentheses are balanced");
    }else{
        System.out.println("parentheses are not balanced");
    }

  
}
static Boolean isBalanced(String s){
      Stack<Character> st=new Stack<>();
    for(int i=0;i<s.length();i++){
        char ch= s.charAt(i);
        if(ch=='{'||ch=='('||ch=='['){
            st.push(ch);
          
        }else{
            if(st.isEmpty()) return false;
            else {
                char top= st.peek();
                if(sameStyle(top,ch)) st.pop();
                else return false;      
        }
    }
    }if(st.empty()) return true;
    else return false;
 
}

static Boolean sameStyle(char a,char b){
if(a=='{' && b=='}')return true;
if(a=='(' && b==')')return  true;
if(a=='[' && b==']')return true;
 return false;

}
}