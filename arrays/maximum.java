package arrays;

//maximum no. in array
public class maximum {
    public static void main(String[] args) {
        int max=0;
        int arr[]={1,2,3,6,7};
        for(int i=0; i<arr.length;i++){
            if(max<arr[i]){
                int temp=max;
                max=arr[i];
                arr[i]=temp;
            }

        }
        System.out.println(max);
    }
}
