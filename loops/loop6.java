package loops;
//      * 
//     * *
//    * * *
//   * * * *
//  * * * * *
public class loop6{
    public static void main(String[] args) {
      for(int i=4; i>=0; i--){
       for(int j=i; j>=0; j--){
          System.out.print(" ");

       }
      for(int k=i; k<=4;k++){
        System.out.print("* ");
      }
      System.out.println();
      }
    }
}