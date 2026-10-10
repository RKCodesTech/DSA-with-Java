package Stack;
import java.util.*;
public class NextGreaterEle {
     public ArrayList<Integer> nextLargeElement(int[] arr){  //method return type arraylist taking arr as input 
          int n=arr.length; //length of arr
          int [] nge =new int [n]; // create nextGreaterElement arr of size n
          nge[n-1] =-1;    //by default the last element's nge will -1
          Stack <Integer> st =new Stack<>();  
          st.push(arr[n-1]);   //push last element to the stack
          for(int i=n-2;i>=0;i--){    //start loop from second largest element to 0th ele
               while(st.size()>0&&arr[i]>=st.peek())st.pop();  //firstly it will check that ifarr[i]>=st.peek then pop ele and st.size>0 to prevent stack from underflow
               if(st.size()==0) nge[i]=-1;    //is there is no element in st then nge[i]=-1;
               else nge[i]=st.peek();   //otherwise put st.peek at nge[i] position because always the st.peek element is NextGreaterEle
               st.push(arr[i]);// then push ele 
          }
          ArrayList<Integer> ans=new ArrayList<>(n);// because return type of method is arraylist store ans in arraylist using loop
          for(int i=0;i<n;i++){
               ans.add(nge[i]);
          }
          return ans;
     }
}
//space complexity -o(n)
//time complexity - o(n)
