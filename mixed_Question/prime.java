package mixed_Question;
// a no. that can devide by other 2 no.
public class prime {
    public static void main(String[] args) {
        int num=4;
        int count==0;
        for(int i=0; i<=20;i++){
            if(num%i==0){
                count++;
            }else{
                continue;
            }

        }if(count==2){
            System.out.println("no. is prime");
        }
    }
}
