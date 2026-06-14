package sorting;
//selectionSort     select minimum then swap it with first element
public class selectionsort {
    public static void main(String[] args) {
     int i=0;
      int arr[]={10,6,18,8,9,8,8,6,7,3};
     for(i=0; i<=arr.length-1;i++){
          int minimal=i;
        for(int j=i+1;j<=arr.length-1; j++){
            if(arr[j]<arr[minimal]){
                minimal=j;
            }
        }
        int temp = arr[i];
        arr[i]=arr[minimal];
        arr[minimal]=temp;
       
     } for(i=0; i<=arr.length; i++){
        System.out.println(arr[i]);
    }
    }
   
}

// TC- outer loop n times 
// inner loop - i	j runs
//             0	n−1 times
//             1	n−2 times
//             2	n−3 times
//             so o(n2)
//     so o(n2)xn=o(n2)

// SC -o(1) no extra variable used