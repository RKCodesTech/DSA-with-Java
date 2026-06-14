package sorting;
public class bubblesort {
public static void main(String[] args) {
    int arr[]={2,5,3,7,5,8,9};
    for(int k=0; k<arr.length;k++){
    for(int i=0;i<arr.length;i++){
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

// TC-outer loop=n times
//    inner loop =n-1 times 
//     nx(n-1)=n^2
//     o(n^2)

// SC - length is not depend on the input , and no extra variable
//      o(1)