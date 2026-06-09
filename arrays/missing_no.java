// Find the Missing Number: Write a program that takes an array of n-1 numbers (ranging
// from 1 to n), where one number is missing, and prints the missing number. For example,
// for the array [1, 2, 4, 5], the missing number is 3.


public class missing_no {
    public static void main(String[] args) {

        int arr[] = {1,2,3,5,6,8,9};

        int expected = 1;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] != expected) {
                System.out.println("Missing number: " + expected);
                i--; // stay on same element
            }

            expected++;
        }
    }
}
// jab expected se i match nhi hoga to expected to badhega hi or or i bhi badhega loop ki vajah se to ham i ko decrement kr denge  jisse expected and i same rahe