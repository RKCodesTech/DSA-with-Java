package arrays;

public class twosumproblem {
    public static void main(String[] args) {
        int [] arr={2,5,3,7,8,3,8};
        int target=11;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+ arr[j]);
                    break;
                }
            }
        }
    }
}
