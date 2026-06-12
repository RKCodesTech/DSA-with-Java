package hashmap;

import java.util.HashMap;

public class hashmap1 {

    public static void main(String[] args) {
int [] arr={1,1,3,2,3,2,2,4,3,2,3,3,3,3,2,2,3,2,2,};
HashMap <Integer,Integer> hash=new HashMap<>();
   for(int i=0;i<arr.length;i++){
    int num=arr[i];
    if (hash.containsKey(num)){
        hash.put(num,hash.get(num)+1 );
    }else{
        hash.put(num,1);
    }
   }   
   System.out.println(hash.get(1));
   System.out.println(hash.get(2));
   System.out.println(hash.get(3));
    }
}//hash