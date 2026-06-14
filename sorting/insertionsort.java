package sorting;

public package sorting;

public class InsertionSort {
    public static void main(String[] args) {

        int arr[] = {12, 11, 13, 5, 6};

        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
} {
    
}
