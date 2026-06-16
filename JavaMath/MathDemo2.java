public class MathDemo2 {
    public static void main(String[] args) {

        // Math.cbrt() - Cube Root
        System.out.println("Cube Root of 27: " + Math.cbrt(27));

        // Math.signum() - Sign of a number
        System.out.println("Sign of -15: " + Math.signum(-15));
        System.out.println("Sign of 20: " + Math.signum(20));
     // Math.exp() - e raised to power x
        System.out.println("e^2: " + Math.exp(2));

        // Math.log() - Natural logarithm
        System.out.println("Log of 10: " + Math.log(10));

        // Math.log10() - Base 10 logarithm
        System.out.println("Log10 of 1000: " + Math.log10(1000));

        // Math.sin() - Sine (angle in radians)
        System.out.println("sin(90°): " + Math.sin(Math.toRadians(90)));

        // Math.cos() - Cosine
        System.out.println("cos(0°): " + Math.cos(Math.toRadians(0)));

        // Math.tan() - Tangent
        System.out.println("tan(45°): " + Math.tan(Math.toRadians(45)));

        // Math.toRadians()
        System.out.println("180 degrees to radians: " + Math.toRadians(180));

        // Math.toDegrees()
        System.out.println("PI radians to degrees: " + Math.toDegrees(Math.PI));

       
   
    }
}
