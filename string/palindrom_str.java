package string;
import java.util.Scanner;
public class palindrom_str {
    public static void main(String[] args) {
    String rev="";
    System.out.println("Enter String:");
    Scanner sc = new Scanner(System.in);
    String word =sc.nextLine();
    char[] arr=word.toCharArray();
    for(int i=arr.length-1;i>=0;i--){
        rev=rev+arr[i];
    }
    System.out.println(rev);
    if (word.equals(rev)){ //we can't use (word==rev) because in string of java == compares address that why it always gives false
        System.out.println("'True' ,Given String is palindrom");
    }else{
        System.out.println("string is not palindrom");
    }
}
}