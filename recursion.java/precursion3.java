// printing n to 1 no. using bactrack means function call first before printing line (without using i-1)
public class precursion2 {
   static void method(int i, int n){
        if(i>n){
            return;
        }
        method(i+1,n);
        System.out.println(i);
    }
    public static void main(String args[]){
        method(1,4);
    }
}
