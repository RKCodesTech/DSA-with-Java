

public class MathDemo {
    public static void main(String[] args) {

        // Math.max()
        System.out.println("Maximum: " + Math.max(5, 10));

          // Math.min()
        System.out.println("Minimum: " + Math.min(5, 10));

        // Math.sqrt()
        System.out.println("Square Root of 64: " + Math.sqrt(64));

        // Math.abs()
        System.out.println("Absolute Value of -4.7: " + Math.abs(-4.7));

         // Math.pow()
        System.out.println("2 raised to the power 3: " + Math.pow(2, 3));

        // Math.round()
        System.out.println("Round 4.6: " + Math.round(4.6));

         // Math.ceil()
        System.out.println("Ceil of 4.1: " + Math.ceil(4.1));

        // Math.floor()
        System.out.println("Floor of 4.9: " + Math.floor(4.9));

         // Math.random()
        System.out.println("Random Number (0.0 to 1.0): " + Math.random());

        // Random number between 0 and 100
        int randomNum = (int)(Math.random() * 101);
        System.out.println("Random Integer (0 to 100): " + randomNum);



    }
}