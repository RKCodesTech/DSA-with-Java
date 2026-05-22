package string;
import java.util.Arrays;
//                            practice thiiisssssssssssssssss without using array
public class anagram_str {
    public static void main(String[] args) {
        String str1="abb";
        String str2="abc";
        int count=0;
        if(str1.length()==str2.length()){
        for(int i=0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    count++;
                }
            }
        }
        if(str1.length()==count){
            System.out.println("String is anagram");
        }
        }else{
            System.out.println("String is not anagram");
        }
        
    }
}
    

