//leetcode 901
package Stack;
import java.util.*;
class stockSpanner {
int day =0;
Stack<int []> st= new Stack();//because storing price and day at a time {100,0}
    public int next(int price) { //one value of price (not whole arr is given)
        while(!st.empty()&& st.peek()[0]<=price){ //check if st.peek()[0] means priceand st.peek()[1] means day
        st.pop(); 
        } 
        int span;  //updated span every time
        if(st.empty()){ span=day+1;}  //if st is empty it will count current day
        else { span=day-st.peek()[1];} //now subtract day with index(st.peek()[1])
        st.push(new int[]{price,day});// then push pair {100,0} in arr
        day++;          //increment day for next 
           return span;   //return span for every price
    }
}
//tc -o(n) for multiple calls
//tc -o(1) for one call
//sc- o(n)

