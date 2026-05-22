// java not support multiple inherritence it gets confuse what to call first..
// thats why it uses interface
interface c1{
    void show1(); //In Java, interfaces cannot have normal method bodies (without using default or static).
   //in func ki body jis class me implement kr rhe hai vaha banegi
}
interface c2{
   default void show2(){//   or use default...
         System.out.println("interface c2");
    }
}
 class c3 implements c1,c2{
public void show1(){
            System.out.println("interface c1");
}
 
 }
public class inheriInterface{
    
    public static void main(String[] args) {
        
        c3 obj=new c3();
        obj.show1();
        obj.show2();
        
    }
}