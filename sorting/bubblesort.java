package sorting;
public class bubblesort {
public static void main(String[] args) {
    int arr[]={2,5,3,7,58,9};
    for(int k=0; k<=arr.length-1;k++){
    for(int i=0;i<arr.length-1;i++){
        if(arr[i]>arr[i+1]){
            int temp =arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
    }
    }
    for(int j=0;j<=arr.length;j++){
        System.out.println(arr[j]);
    }
}
}