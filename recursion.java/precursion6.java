import java.util.Arrays;
public class pp {
    static void function(int[]array , int i,int j){
        if(  array[i]=array[j];){
             function(array ,i+1,j-1);
             System.out.println("String is palidrom");
        }
       else{
        System.out.println("String is not palidrom");
       }
       
    }
    public static void main(String[] args) {
        char[] array={'l' 'e' 'v' 'e ' 'l'};
        function(array, 0, array.length-1);
        System.out.println(Arrays.toString(array));
    }
}
