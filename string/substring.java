package string;

public class substring {
    public static void main(String[] args) {
    String substr="riya";
    String str = "my name is riya and riya is me ";
    String [] words= str.split(" ");
    for(int i=0;i<words.length;i++){
       if(substr.equals(words[i])){
        System.out.println("Substrng is found");
        System.out.println(words[i]);
       }
    }
    }
}
