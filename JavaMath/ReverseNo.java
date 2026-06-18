public class ReverseNo {
   
    public static void main(String[] args) {
        int n = 12345;
        int rev = 0;

        while (n > 0) {
            int digit = n % 10;    //12345
            rev = rev * 10 + digit;
            n /= 10;
        }

        System.out.println("Reversed Number: " + rev);//understand
    }
}
