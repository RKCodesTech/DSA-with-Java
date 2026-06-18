public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121, temp = num, rev = 0;

        while (temp > 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
//palindrome.java
        if (num == rev)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
    //palindrome  program
}