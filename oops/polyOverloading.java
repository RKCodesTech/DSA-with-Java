public class polyOverloading {
    void add(int a,int b){
System.out.println(a+b);
    }void add(int a,int b,int c){
System.out.println(a+b+c);
    }
    public static void main(String[] args) {
        polyOverloading obj=new polyOverloading();
        obj.add(2,4);
        obj.add(3,5,7);
    }
}
