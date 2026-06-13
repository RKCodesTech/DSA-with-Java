package hashmap;

import java.util.HashMap;

public class HashStirng {
    public static void main(String[] args) {
        String str="ababababcacc";
        HashMap <Character,Integer>hash =new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hash.containsKey(ch)){
                hash.put(ch,hash.get(ch)+1);
            }else{
                hash.put(ch, 1);
            }
        }
        // for(int i=0;i<str.length();i++){
        // char ch=str.charAt(i);                   //this will print frequecy of each char like a=5b=4a=5b=4

        
        // System.out.println(ch+"="hash.get(ch));
        // }
        for(char ch: hash.keySet()){
            System.out.println(ch+" = "+hash.get(ch));
        }
    }
}
