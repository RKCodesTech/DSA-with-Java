package oops;


public class constructorUsingThis {
    int a;
    int s;

    constructorUsingThis(int a, int s) {
        this.a = a;
        this.s = s;
    }

    void display() {
        System.out.println(a + " " + s);
    }

    public static void main(String[] args) {
        constructorUsingThis obj = new constructorUsingThis(3, 5);
        constructorparameterized obj1 = new constructorUsingThis(2, 50);
        obj1.display();
        obj.display();
    }
}
