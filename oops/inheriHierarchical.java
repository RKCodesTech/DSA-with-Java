class c1{
    void show(){
System.out.println("hi im class C1");
    }
}
class c2 extends c1{
    void show1(){
System.out.println("hi im class c2");
    }
}
class c3 extends c1{
    void show3(){
System.out.println("hi im class c3");
    }
}

public class inheriHierarchical {
    public static void main(String[] args) {
        c2 objc2=new c2();
        objc2.show1();
        objc2.show();
System.out.println("--------------------");
        c3 objc3= new c3();
        objc3.show3();
        objc3.show();
    }
    
}
