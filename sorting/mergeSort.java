package sorting;
import java.util.Arrays;

public class MergeSort {

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);

            // Sort right half
            mergeSort(arr, mid + 1, right);

            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0, k = left;

        // Merge the temp arrays
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
            }
        }

        // Copy remaining elements
        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted Array: " + Arrays.toString(arr));
    }
}
// Main Steps of Merge Sort
// Step 1: Divide
// Divide the array into two equal halves.

// Find the middle index using:

// mid = left + (right - left) / 2;
// Step 2: Recursively Sort
// Recursively apply Merge Sort on the left half.
// Recursively apply Merge Sort on the right half.
// Continue dividing until each subarray contains only one element.

// A single-element array is already sorted.

// Step 3: Merge
// Create two temporary arrays for the left and right halves.
// Compare the elements of both arrays one by one.
// Copy the smaller element into the original array.
// After one temporary array is exhausted, copy the remaining elements of the other array.
// Step 4: Repeat
// Repeat the merge process while returning from the recursive calls.
// Eventually, all subarrays are merged into one completely sorted array.