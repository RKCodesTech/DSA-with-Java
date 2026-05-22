package string;
public class count_vowel {
    public static void main(String[] args) {
        int count=0;
        String str="morning and my truth";
        for(int i=0;i<str.length(); i++){
            char ch = str.charAt(i);
           if(ch=='i'||ch=='o'||ch=='u'||ch=='a'){
            count++;
           }
          
        } System.out.println(count);
    }
}