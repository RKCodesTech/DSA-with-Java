package mixed_Question;
public class strongNo {
    public static void main(String[] args) {
       int num=145;
       while(num>0){
        int digit=num%10;
        int fact=1;
        int sum;
        for(int j=1; j<=digit;j++){
            fact*=j;
            sum=sum+fact;
        }
        int num=num/10;
       }
    }
}
       
  