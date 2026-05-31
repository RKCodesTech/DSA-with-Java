package Generic;

interface inter<T> {
    void set(T value);

    T get();
}

class Boox<T> implements inter<T> {
    private T value;

    public void set(T value) {
        this.value = value;
    }

    public T get() {
        return value;
    }
}

public class GenInterface {
    public static void main(String[] args) {
        Boox<Integer> b1 = new Boox<>();
        b1.set(1);
        Integer s = b1.get();
        System.out.println(s);
    }
}
