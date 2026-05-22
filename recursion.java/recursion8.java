// Find the sum of first N natural numbers.
import java.util.Scanner;
public class recursion8 {
    static int s= 1;
    static int n=0;
    static int x=0;
    static void method(){
        if (n==0){
          

            return;
        }
        s=s*x;
        n--;
        System.out.println(" power  = " + s);
        method();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
    System.out.println("Enter no.");
    x= sc.nextInt();
    Scanner sc1=new Scanner(System.in);
    System.out.println("Enter power");
    n=sc1.nextInt();
    method();
    }
}