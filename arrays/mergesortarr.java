package arrays;

import java.util.Arrays;
public class mergesortarr {
    public static void main(String[] args) {
        int[] arr1={2,4,2,6,8,3,8};
        int[] arr2={9,5,8,3,9,3}; 
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

    }
}
