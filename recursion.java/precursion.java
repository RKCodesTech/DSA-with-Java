 // how to pint name n times by using parameterized recusion
 import java.util.Scanner;
public class precursion {
     static void method(int i, int n){
       if(i<n) {
        return;
       }
       System.out.println("riyakosta");
       method(i+1,n);
     }
     public static void main(String args[]){
        System.out.println("How many time you want to print name! Enter No.");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        method(1,n);
       
        }
     }

