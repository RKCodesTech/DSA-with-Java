package string;
import java.util.Scanner;
public class practice_str {
    public static void main(String[] args){
        String name = "  riya  ";
        String n=name.toUpperCase();//covert string into uppercase
        System.out.println(n);
        System.out.println( name.replace( ' ', '_'));//replace spaces with underscore
        String phrase= "I adore [name] ; he  is a very powerful anime character";
        System.out.println("Enter name of your favorite anime character");
        Scanner sc= new Scanner(System.in);// this all tam jham is for taking input string/name from user and replace it with placeholder
        String character= sc.nextLine();
        System.out.println(phrase.replace("[name]" ,character));
        if (phrase.contains("  ")){
        System.out.println("two spaces are there");
        }
        if (phrase.contains("   ")){
        System.out.println("three spaces are found...");
        String name1= "Riyakosta";
        StringBuffer sb = new StringBuffer(name1);
        sb.reverse();
        System.out.println("Reversed String: "+sb);

        }
    }
}