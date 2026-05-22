package oops;
class cars{
   String carname="BMW";
   String model="M5";
   int price=10040035;
   int disount=25;
   void dis(){
    int finalprice=price-((price * disount) / 100);
    System.out.println(finalprice);
   } 
}
public class cardisscount {
    public static void main(String[] args) {
        
    
    cars c1=new cars();
    System.out.println("Name: " + c1.carname);
System.out.println("Model: " + c1.model);
System.out.println("Original price: " + c1.price);
System.out.println("Discount in %: " + c1.disount);
    c1.dis();
}
}