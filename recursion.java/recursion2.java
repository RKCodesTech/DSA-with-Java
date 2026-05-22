public class recursion2 

{ static int count=0; 
    static void method(){
        System.out.println("ria kosta");
        count++;
        if(count==4){
            return;
        }
        method();
    }

    public static void main(String[] args) {
         
        method();
    }
}
