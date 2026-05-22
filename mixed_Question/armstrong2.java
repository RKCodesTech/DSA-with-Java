// user will enter the range from whete he want to print no. is armstrong or not

import java.util.Scanner;
public class armstrong2 {
       public static void main(String[] args) {
        System.out.println("enter no.");
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        System.out.println("enter a range");
        Scanner sc1=new Scanner(System.in);
        int y=sc1.nextInt();
        for(int i=x;i<=y;i++){
        int num=i;
        int a =num/100;
        int b=(num/10)%10;
        int c=num%10;
       a=a*a*a;
       b=b*b*b;
       c=c*c*c;
       int d=a+b+c;
      
       if(d==num){
        System.out.print("number is armstrong");
         System.out.println(d);
       }
        }
      
    }
}
