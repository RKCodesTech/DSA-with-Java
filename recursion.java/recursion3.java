//print no. 0 to n using recursion
import java.util.Scanner;
public class recursion3{
    static int count =0;
    static int n;
      
    static void method1(){
        
        if (count>n){
            return;
              }
            System.out.println(count);
            count++;
          method1();
      
    }
    public static void main(String[] args) {
        System.out.println("Enter n :");
        Scanner sc =new Scanner(System.in);
  n=sc.nextInt();
        method1();
    }
}