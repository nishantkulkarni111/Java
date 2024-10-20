import java.util.Arrays;
import java.util.*;

class MycharStack {
    private char arr[];
    private int top;

    public MycharStack() {
        arr = new char[10];
        top = -1;
    }

    public MycharStack(int i) {
        arr = new char[i];
        top = -1;
    }

    public boolean Isfull() {
        return top == arr.length - 1;
    }

    public boolean IsEmpty() {
        return top == -1;
    }
    

    public void push(char value) {
        if (Isfull()) {
            System.out.println("\nOverflow.....");
            return;
        }
        top = top + 1;
        arr[top] = value;
    }

    public char pop() {
        if (IsEmpty()) {
            System.out.println("\nUnderflow");
            return '\0';
        }
        char d = arr[top];
        top = top - 1;
        return d;
    }

    public char peek() {
        if (IsEmpty()) {
            System.out.println("No values..");
            return '\0';
        }
        return arr[top];
    }

    public String toString() {
        String result = "Arr = ";
        for (int i = top; i >= 0; i--) {
            result += arr[i] + " ";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MycharStack stack = new MycharStack(20);
        int choice;
        char value;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    value = scanner.next().charAt(0);
                    stack.push(value);
                    break;
                case 2:
                    System.out.println("Popped value: " + stack.pop());
                    break;
                case 3:
                    System.out.println("Top value: " + stack.peek());
                    break;
                case 4:
                    System.out.println(stack.toString());
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}