package arrays;

public class findindex {
    public static void main(String[] args) {
        int[] arr={2,4,6,3,7,9};
        int target=4;
        for(int i=0; i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("index of "+target+" : "+i);
            }
        }
    }
}
