package loops;
import java.util.*;
public class NoToPattern {
    public static void main(String[] args) {
        int[] arr= new int[4];
        System.out.println("Enter Four Numbers");
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<4;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<=max;j++){
                if (arr[j]>i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
        }
    }
}