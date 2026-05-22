package string;
import java.util.Scanner;
public class frequency_str {
    public static void main(String args[]){
        String str="i adore tanjiro and i also like his sister nezuko and i love to see inosuke and nezuko together ";
        String repeatedString ="";
        System.out.println("enter string to find there frequency ");
        Scanner sc= new Scanner(System.in);
        String newstr =sc.nextLine();
        for (int i=0; i<str.length();i++){
            if (str.equals(newstr)){
                repeatedString=str;
                break;
            }
           
        } System.out.println("Frequency: " +repeatedString);
    } 
}
