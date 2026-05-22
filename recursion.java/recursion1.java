// infinite recursion
public class recursion1 {
    static void method(){
        System.out.println("1");
        method();
    }
    public static void main(String[] args) {
        method();
    }
}
