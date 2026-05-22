//sum of first n numbers using parametrizeed recusion...
import java.util.Scanner;
public class precursion4 {
    static int sum=0;
    static void method(int i,int n){
        if (i>n){
            System.out.println(sum);
            return;
        }
        sum=sum+i;
        method(i+1,n);
    }
    public static void main(String[] args) {
        System.out.println("Enter N: ");
        Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        method(0,n);
    }
}
