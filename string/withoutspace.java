package string;

public class withoutspace {
   
    public static void main(String[] args) {
         String str = "I am learning Java";
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                continue;
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}


