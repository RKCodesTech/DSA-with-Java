package hashmap;

 import java.util.HashMap;

public class hashHighest {
    public static void main(String[] args) {

        int arr[] = {2, 4, 2, 5, 3, 5, 2, 4, 5};

        HashMap<Integer, Integer> hash = new HashMap<>();

        // Step 1: Count frequencies
        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (hash.containsKey(num)) {
                hash.put(num, hash.get(num) + 1);
            } else {
                hash.put(num, 1);
            }
        }

        // Step 2: Find maximum frequency element
        int maxFreq = 0;
        int maxElement = 0;

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (hash.get(num) > maxFreq) {
                maxFreq = hash.get(num);
                maxElement = num;
            }
        }

        System.out.println("Element with highest frequency = " + maxElement);
        System.out.println("Frequency = " + maxFreq);
    }
} {
    
}
