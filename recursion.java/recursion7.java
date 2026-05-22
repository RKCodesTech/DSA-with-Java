// Find the sqaure of first N natural numbers.
import java.util.Scanner;
public class recursion7 {
    static int sum= 0;
    static int i=0;
    static int n=0;
    static void method(){
     if(i>n){
         
        return; }
        sum=i*i;
       System.out.println(sum);
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
