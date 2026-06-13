package hashmap;

import java.util.HashMap;

public class nonRepeating {
    public static void main(String[] args) {
        HashMap<Character,Integer> hash= new HashMap<>();
        String str= "abbabcabaga";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
        if(hash.containsKey(ch)){
            hash.put(ch, hash.get(ch)+1);
        }else{
            hash.put(ch, 1);
        }
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(hash.get(ch)==1){
                System.out.println( ch+ " "+hash.get(ch));
                break;//                         this will print only 1st repeating character
            }
        }
    } 
}
