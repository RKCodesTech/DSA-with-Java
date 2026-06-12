package hashmap;

import java.util.HashMap;

public class hashmap1 {

    public static void main(String[] args) {

        int arr[] = {2, 4, 2, 5, 3, 5, 2, 4, 5};

        HashMap<Integer, Integer> hash = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            int num = arr[i];

            if (hash.containsKey(num)) {
                hash.put(num, hash.get(num) + 1);
            } else {
                hash.put(num, 1);
            }
        }

        System.out.println(hash);
    }
}