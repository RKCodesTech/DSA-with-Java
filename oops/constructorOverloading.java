package oops;
public class constructorOverloading {
    int a,b;
    constructorOverloading(int i){//costructor1
       a=i;
    }
    constructorOverloading(int j,int k){//costructor2
        a=j;
        b=k;  
    }
    void display(){
        System.out.println(a+" "+b);
    }
    public static void main(String[] args) {
        constructorOverloading obj=new constructorOverloading(3);
        constructorOverloading obj2=new constructorOverloading(35, 0);
        obj.display();
        obj2.display();
    }
}















