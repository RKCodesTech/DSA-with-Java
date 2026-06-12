package hashmap;

 import java.util.HashMap;

public class hashHighest {
    public static void main(String[] args) {
            int largestnum=0;
    int largestvalue=0;

        int arr[] = {2, 4, 2, 5, 3, 5, 2, 4, 5};

        HashMap<Integer, Integer> hash = new HashMap<>();
for(int i=0;i<arr.length;i++){
    int num=arr[i];
    if(hash.containsKey(num)){
        hash.put(num, hash.get(num)+1);
    }else{
        hash.put(num, 1);

    }
}

for(int i=0;i<arr.length;i++){

    int num=arr[i];
    if(hash.get(num)>largestvalue){
        largestvalue=hash.get(num);
        largestnum=num;
    }
}
    System.out.println("Element with highest frequency = " + largestnum);
System.out.println("Frequency = " + largestvalue);    

    }}








        
    
}
