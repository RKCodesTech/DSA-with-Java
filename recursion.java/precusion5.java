//reverse an array
import java.util.Arrays;
public class precusion5 {
  static void method(int[] array ,int l, int r){
    if (l>=r){
        return;
    }
  
   int temp = array[l];
        array[l] = array[r];
        array[r] = temp;
method(array, l+1,r-1);
   } 
   public static void main(String args[]){
 int[] array={1,2,3,4,5};
 method(array, 0,array.length-1);
 System.out.println(Arrays.toString(array));
   }
}
