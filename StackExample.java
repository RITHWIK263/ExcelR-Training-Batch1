import java.util.Scanner;

class StackProblem {
    private int maxSize;
    private int top;
    private int[] stack;

    
    public StackProblem(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;  
    }

    
    public boolean isFull() {
        return top == maxSize - 1;
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full! Cannot push " + element);
        } else {
            stack[++top] = element;
            System.out.println("Pushed " + element + " to the stack.");
        }
    }

    
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty! Cannot pop.");
            return -1;  
        } else {
            int poppedElement = stack[top--];
            System.out.println("Popped " + poppedElement + " from the stack.");
            return poppedElement;
        }
    }

    
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty! No element to peek.");
            return -1;
        } else {
            return stack[top];
        }
    }

    
    public int size() {
        return top + 1;
    }
}

public class StackExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        StackProblem stack = new StackProblem(5);

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if Empty");
            System.out.println("5. Stack Size");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    int element = scanner.nextInt();
                    stack.push(element);
                    break;

                case 2:
                    stack.pop();
                    break;

                case 3:
                    int topElement = stack.peek();
                    if (topElement != -1) {
                        System.out.println("Top element: " + topElement);
                    }
                    break;

                case 4:
                    System.out.println("Stack is empty: " + stack.isEmpty());
                    break;

                case 5:
                    System.out.println("Current stack size: " + stack.size());
                    break;

                case 6:
                    System.out.println("Exiting program.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}