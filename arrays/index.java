package arrays;
import java.util.Scanner;
public class index{
    public static void main(String[] args) {
        int index=-1;
        int arr[]={3,34,67,4,56,8};
        System.out.println("EnTer EleMent of array to search their index");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0; i<arr.length;i++){
            if(arr[i]==a){
                index=i;  
            }
        }
        System.out.println(index);

    }
}