package Stack;

public class StackOperation {
    int arr[] = new int[5];
    int top = -1;

    // Push
    public void push(int data) {
        if (top == arr.length - 1) {
            System.out.println("Stack Overflow");
            return;
        }

        arr[++top] = data;
        System.out.println(data + " pushed");
    }

    // Pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow");
            return -1;
        }

        return arr[top--];
    }

    // Peek
    public int peek() {
        if (isEmpty()) {
            return -1;
        }

        return arr[top];
    }

    // Check Empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check Full
    public boolean isFull() {
        return top == arr.length - 1;
    }

    // Display
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty");
            return;
        }

        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        System.out.println("Top: " + s.peek());
        System.out.println("Removed: " + s.pop());

        s.display();

        System.out.println("Is Empty: " + s.isEmpty());
        System.out.println("Is Full: " + s.isFull());
    }
}