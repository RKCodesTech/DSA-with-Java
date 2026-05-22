public class RotationCheck {
    public static void main(String[] args) {
        String s1 = "ABCD";
        String s2 = "CDAB";
        if(s1.length() != s2.length()) {
            System.out.println("Not Rotation");
            return;
        }
        for(int i = 0; i < s1.length(); i++) {
            String rotated = s1.substring(1) + s1.charAt(0);
            s1 = rotated;
            if(s1.equals(s2)) {
                System.out.println("Rotation");
                return;
            }
        }
        System.out.println("Not Rotation");
    }
}
// abcd  
// bcda