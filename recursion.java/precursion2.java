// printing 1 to n no. using bactrack means function call first before printing line (without using i+1)
public class precursion2 {
   static void method(int i, int n){
        if(i<1){
            return;
        }
        method(i-1,n);
        System.out.println(i);
    }
    public static void main(String args[]){
        method(4,4);
    }
}
