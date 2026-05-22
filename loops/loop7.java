package loops;
// * * * * *
//  * * * *
//   * * *
//    * *
//     *
public class loop7 {
    public static void main(String[] args) {
        int num=6
        ;
    for(int i=0; i<=num ;i++){
       for(int j=0; j<=i; j++){
        System.out.print(" ");
       }
       for(int k=0; k<=num-i-1; k++){
        System.out.print("* ");
       }
       System.out.println();
    }
    }
}
