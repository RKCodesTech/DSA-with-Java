package string;
import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        String str = "you should watch demon slayer once in your life";
        int count = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char x = sc.next().charAt(0);  // store as char

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == x) {
                count++;
            }
        }

        System.out.println("Total number of occurrences: " + count);
        sc.close();
    }
}