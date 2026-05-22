class c1{
c1(){
System.out.println("my");
}
}
class c2 extends c1{
c2(){
    System.out.println("name");
}
}class c3 extends c2{
    c3(){
        System.out.println("is riya");
    }
}
public class inheriMultilevel {
    public static void main(String[] args) {
        c3 obj=new c3();
    }
}
