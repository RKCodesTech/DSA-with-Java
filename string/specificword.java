package string;

public class specificword {
    public static void main(String[] args) {
        String str="you are the best";
        String specific="best";
        String[] arr=str.split(" ");
       for(String word:arr){
        if(word.equals(specific))    System.out.println("fond!!!");
       }
    }
}
