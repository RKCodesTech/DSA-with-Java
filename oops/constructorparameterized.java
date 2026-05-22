package oops;

import loops.prac;

public class constructorparameterized {
    int a;
    int s;

    constructorparameterized(int i, int j) {
       a=i;
       s=j;
    }

    void display() {
        System.out.println(a + " " + s);
    }

    public static void main(String[] args) {
        constructorparameterized obj = new constructorparameterized(3, 5);
        constructorparameterized obj1 = new constructorparameterized(2, 50);
        obj1.display();
        obj.display();
    }
}
