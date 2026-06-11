package arrays;

import java.util.Arrays;
public class movezeroatend {
    public static void main(String[] args) 
    {
       int arr[]={1,0,0,5,0,6,5,40,5,0,5,0,5,0};
       int index= 0;
       for(int i=0; i<arr.length;i++){
        if(arr[i]!=0){                      //this will take non 0's at the start
            arr[index]=arr[i];
            index++;
        }
       }
       while(index<arr.length){
        arr[index]=0;                  // this will fill 0s at remainnign place
        index++;
       }
    }
}
