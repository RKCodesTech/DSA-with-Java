 import java.util.Scanner;
public class precursion1 {
     static void method(int i, int n){
       if(i>n) {
        return;
       }
       System.out.println(i);
       method(i+1,n);
     }
     public static void main(String args[]){
        System.out.println("How many time you want to print name! Enter No.");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        method(0,n);
     }
}
