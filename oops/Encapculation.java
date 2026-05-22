class c{
    private String p="pillu mate pond khujate lota leke tatti jate";
    void  get(){
        this.p=p;
        System.out.println(p);
    }
    void set(String name){
        this.p=name;
        System.out.println(name);
    }
}

public class Encapculation {
    public static void main(String[] args) {
        c onj=new c();
        onj.get();
        onj.set("riya");
    }
}
