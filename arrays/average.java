package arrays;

public class average {
    public static void main(String[] args) {
        int sum=0;
        
        
        int arr[]={3,5,6,24,7};
        for(int i=0; i<arr.length;i++){
            sum += arr[i];
            
        }
        double a =sum/arr.length;
        System.out.println(a);
    }
}
//i understand the logic