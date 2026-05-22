package arrays;

public class average {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        
        int arr[]={3,5,6,24,7};
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
            count++;
        }
        double a =(double)sum/count;
        System.out.println(a);
    }
}
