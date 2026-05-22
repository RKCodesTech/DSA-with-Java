
public class armstrong{
    public static void main(String[] args) {
        int num=153;
        int a =num/100;
        int b=(num/10)%10;
        int c=num%10;
       a=a*a*a;
       b=b*b*b;
       c=c*c*c;
       int d=a+b+c;
       System.out.println(d);
       if(d==num){
        System.out.println("number is armstrong");
       }else{
        System.out.println("no. is not armstrong");
       }
    }
}