public class SecondLargestDigit {
    public static void main(String[] args) {

        String str = "a4b9c7";

        int largest = -1;
        int secondLargest = -1;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isDigit(ch)) {
                int num = ch - '0';

                if (num > largest) {
                    secondLargest = largest;
                    largest = num;
                } 
                else if (num > secondLargest && num != largest) {
                    secondLargest = num;
                }
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Second Largest: " + secondLargest);
    }
}