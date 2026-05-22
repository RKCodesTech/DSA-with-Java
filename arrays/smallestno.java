package arrays;

public class smallestno {
    public static void main(String[] args) {
        int[] arr={2,4,6,1,7};
        int samllest=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<samllest){
                int temp=samllest;
                samllest=arr[i];
                arr[i]=temp;
            }
        }
        System.out.println(samllest);
    }
}
