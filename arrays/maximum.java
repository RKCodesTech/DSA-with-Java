package arrays;

//maximum no. in array
public class maximum {
    public static void main(String[] args) {
        int num=0;
        int arr[]={1,2,3,6,7};
        for(int i=0; i<arr.length;i++){
            if(num<arr[i]){
                int temp=num;
                num=arr[i];
                arr[i]=temp;
            }

        }
        System.out.println(num);
    }
}
