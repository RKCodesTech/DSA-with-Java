package arrays;

public class copyarr {
    public static void main(String[] args) {
        int[] arr={3,5,7,3,6,8,2};
        int[] copy=new int [arr.length];
        System.arraycopy(arr, 0, copy, 0, arr.length);
        for(int element:copy){
            System.out.println(element);
        }
    }
}
