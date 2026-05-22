public class evenOddCount {
    public static void main(String[] args) {
        int num = 48291;
        int evenCount = 0;
        int oddCount = 0;
        while (num > 0) {
            int digit = num % 10;
            if (digit % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            num = num / 10;
        }
        System.out.println("Even digits: " + evenCount);
        System.out.println("Odd digits: " + oddCount);
    }
}

