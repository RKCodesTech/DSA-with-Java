// Find the sum of first N natural numbers.
import java.util.Scanner;
public class recursion5 {
    static int sum= 0;
    static int i=0;
    static int n=0;
    static void method(){
     if(i>n){
          System.out.println(sum);
        return; }
        sum=sum+i;
      
        i++;
    method();
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in) ;
    System.out.println("Enter no. you want to find sum ");
    n= sc.nextInt();
    method();
    }
}
