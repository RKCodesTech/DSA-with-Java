package arrays;

import java.util.Arrays;

public class movezeroatend {
    public static void main(String[] args) 
    {
        int[] arr={0,3,6,0,6,0,6,9,6,9,0,0};
        int index=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[index]=arr[i];
                index++;
            }

        }while(index<arr.length){
            arr[index]=0;
            index++;
        }
        System.out.println(Arrays.toString(arr));
    }
}
