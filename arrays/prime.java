

public class prime {
    public static void main(String[] args) {
        int arr[]={2,4,6,5,8,1};
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if (arr[i]%2==0){
              
                arr[i]+=1;
            }else{
                 arr[i]+=2;
            }
            System.out.println(arr[i]);
        }
        
    }
}
