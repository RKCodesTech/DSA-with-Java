package oops;
class Carr{
 String color="red";
 String name="BMW";
 String model;
 void fun(){
    System.out.println("One of the luxryy car");
 }
}
public class car {
   public static void main(String[] args) {
     Carr c1=new Carr();
    c1.fun();
    c1.model="m5";
    System.out.println(c1.color+"\n"+c1.model);
   }
}
