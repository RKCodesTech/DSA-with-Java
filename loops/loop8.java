package loops;
//  * * * * * 
//   *     *
//    *   *
//     * *
//      *
public class loop8 {
    public static void main(String[] args) {
         int num=5;
   for(int i=0; i<num; i++){
    for(int j=0 ;j<=i; j++){
        System.out.print(" ");
       
    }
   
    for(int k=0; k<=num-i-1; k++){
  
        if(i==0||i==num-1||k==0||k==num-i-1){
               System.out.print("* ");
        }
     else{
        System.out.print("  ");
    }
    }
    System.out.println();
   } 
    }
  
}
