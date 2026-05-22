// “Copy one object → into another object”
package oops;

public class construtorCopy {
    int a;
    String name;                   //  instace/class variable
    construtorCopy(int a , String name){   //normal constructor
        this.a=a;
        this.name=name;
    }
    construtorCopy(construtorCopy s){
        this.a=s.a;
        this.name=s.name;
    }
    public static void main (String[] args){
        construtorCopy obj1=new construtorCopy(3, "riya");
        construtorCopy obj2=new construtorCopy(obj1)  ;     //copy constructor
    }
}

