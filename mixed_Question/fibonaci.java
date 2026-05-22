public class fibonaci {
    public static void main(String[] args) {
        int prev1=0;
        int prev2=1;
        int next;
        int num=10;
        System.out.print(prev1+" " +prev2);
   for(int i=2;i<num;i++ ){
     next=prev1+prev2;
     System.out.print(" "+next);
     prev1=prev2;
     prev2=next;
   }
}
}
