package arrays;

import java.util.Arrays;
public class mergesortarr {
    public static void main(String[] args) {
        int[] arr1={2,4,2,6,8,3,8};
        int[] arr2={9,5,8,3,9,3}; 
        int[] mergedarr=new int[arr1.length+arr2.length];
        System.arraycopy(arr1, 0, mergedarr, 0, arr1.length);
        System.arraycopy(arr2, 0, mergedarr, arr1.length, arr2.length);
        
        for(int i=0;i<mergedarr.length;i++){
            for(int j=i+1;j<mergedarr.length;j++){
                if(mergedarr[i]>mergedarr[j]){
                    int temp=mergedarr[i];
                    mergedarr[i]=mergedarr[j];
                    mergedarr[j]=temp;
                }
                //or use mergedarr.sort();          for sorting 
            }
        }
        for(int elements: mergedarr){
            System.out.println(elements);
        }
      
    }
}