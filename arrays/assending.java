package arrays;

public class assending {
    public static void main(String[] args) {
        int[] arr={8,4,9,2,5,3,2,0,};
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
                
            }
            System.out.print(arr[i]+" ");
        }
            
        }
        }
