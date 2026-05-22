class cat{
void soud(){
    System.out.println("meow");
}
}
class dog extends cat{
    
void soud(){
    System.out.println("bark");
}
}
public class polyOverriding {
    public static void main(String[] args) {
        dog obj=new dog();
        obj.soud();
        cat obj1 =new cat();
        obj1.soud();
    }
}
