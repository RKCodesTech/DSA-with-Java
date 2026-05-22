package oops;
public class riyaa{
    int age;
    int marks;
    riyaa(int age, int marks){
        this.age=age;
        this.marks=marks;
System.out.println(age+"     "+marks);
    }

}
public class constructor {


    public static void main(String[] args) {
        riyaa r=new riyaa(3, 50);
    }
}