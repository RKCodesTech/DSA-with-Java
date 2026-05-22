
public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp = temp / 10;
            
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 1; i <= digits; i++) {
                power = power * digit;
            }
            
            sum = sum + power;
            temp = temp / 10;
        }

        if (sum == original) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");
        }
    }
}
