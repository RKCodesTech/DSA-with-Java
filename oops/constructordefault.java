//Has no parameters , Used to give default/fixed values .only one time can intilize value
// Automatically created by compiler if you don’t write any constructor , 
public class constructordefault {
  
        int a;
        String name;
        constructordefault(){
             a=20;
             name="Riya";
          
        }
        void display(){
            System.out.println(a+" "+name);
        }
    
    public static void main(String[] args) {
        constructordefault obj=new constructordefault();
        obj.display();

    }}
