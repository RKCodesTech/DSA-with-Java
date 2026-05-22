class c1{
void show(){
    System.out.println("c1");
}
}
interface I2{
default void show2(){
    System.out.println("Interface 2");
}
}
class c3 extends c1 implements I2{
void show3(){
    System.out.println("c3");
}
}
class c4 extends c3{
void show4(){
    System.out.println("c4");
}
}
public class inheriHybrid {
    public static void main(String[] args) {
        c4 obj=new c4();
        obj.show();
        obj.show2();
        obj.show3();
        obj.show4();
    }
}
