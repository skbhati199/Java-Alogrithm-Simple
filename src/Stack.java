import java.util.Scanner;

public class Stack {

    static int CAPCITY;
    static int top = -1;
    static int stack[];
    static int item;
    static Scanner scanner = new Scanner(System.in);

    static {
        Stack.createMemory();
    }

    static private void createMemory() {
        System.out.println("Enter stack size");
        int size = scanner.nextInt();
        CAPCITY = size;
        stack = new int[CAPCITY];
    }


    public static void main(String[] args) {

//        System.out.println("Enter the Value \n");
//        int item = scanner.nextInt();
//        System.out.println("Value " + item);

        while (true) {
            System.out.println("Enter your choice");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Exit");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Enter element");
                    push(scanner.nextInt());
                    break;
                case 2:
                    int type = pop();
                    if (type == 1) {
                        System.out.println("Stack under flow");
                    } else {
                        System.out.println("Value is pop");
                    }
                    break;
                case 3:
                    int value = peek();
                    if (value == 0) {
                        System.out.println("Stack under overflow");
                    } else {
                        System.out.println("Peek Value is " + value);
                    }
                    break;
                case 4:
                    traverse();
                    break;
                case 5:
                    exit();
                    break;
                default:
                    System.out.println("Invalid Input");
                    break;
            }
        }
    }

    /*Push Elements*/
    static void push(int value) {
        if (isFull()) {
            System.out.println("Stack overflow!");
        } else {
            top = top + 1;
            stack[top] = value;
        }
    }

    static private boolean isFull() {
        if (top == CAPCITY - 1) {
            return true;
        } else {
            return false;
        }
    }

    /*Deletel Element*/
    static int pop() {
        if (isEmpty()) {
            return 1;
        } else {
            item = stack[top--];
            return 0;
        }
    }

    private static boolean isEmpty() {
        if (top == -1) {
            return true;
        } else
            return false;
    }

    static int peek() {
        if (isEmpty()) {
            return 0;
        } else {
            return stack[top];
        }
    }

    static void traverse() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println("" + stack[i]);
            }
        }
    }

    static void exit() {
        System.exit(1);
    }
}
