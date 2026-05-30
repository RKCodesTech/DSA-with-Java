// package Generic;
//  class Box{
//  private Object value;
//  public Object get(){
//     return value;
//  }
//  public void set(Object value){
//     this.value=value;
//  }
// }
// public class ObjectGen {
//     public static void main(String[] args) {
//         Box b1=new Box();
//         b1.set(1);
//         String i =(String) b1.get();// error because casting integer value to String but not showing at runtime so 
//                                     // we'll convert that class in to Generic class in below code
//         System.out.println(i);
//     }
// }


package Generic;
 class Box<T>{
 private T value;
 public T get(){
    return value;
 }
 public void set(T value){
    this.value=value;
 }
}
public class ObjectGen {
    public static void main(String[] args) {
        Box<Integer> b1=new Box<>();
        b1.set(100);
        // String s= (String) b1.get();// red line on this Now code become type safe on runtime
                      int s=b1.get();              
        System.out.println(s);
    }
}
