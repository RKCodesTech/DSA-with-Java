package sorting;
//selection sort
public class selectionsort {
    public static void main(String[] args) {
     int i=0;
      int arr[]={10,6,188,9,8};
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
