package oops;

import loops.prac;

public class parameterizedconstructor {
    int a;
    int s;

    parameterizedconstructor(int a, int s) {
        this.a = a;
        this.s = s;
    }

    void display() {
        System.out.println(a + " " + s);
    }

    public static void main(String[] args) {
        parameterizedconstructor obj = new parameterizedconstructor(3, 5);
        parameterizedconstructor obj1 = new parameterizedconstructor(2, 50);
        obj1.display();
        obj.display();
    }
}
