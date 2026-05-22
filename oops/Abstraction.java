abstract class a{
    abstract void b();
    a(){
        
    System.out.println("hello im abstract class");
}
    }
class ab extends a{
   public void c(){
        
    System.out.println("hellooooo");
}
public void b(){
    System.out.println("i m method of abstract class");
}
    }
public class Abstraction {
    public static void main(String[] args) {
        a obj=new ab();
        obj.b();
    }
}
