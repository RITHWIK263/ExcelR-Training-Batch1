public class Demo09 {

    public static void main(String[] args) {
        // Declare variables
        int a = 5;
        int b = -10;
        boolean flag = true;

        // Unary Plus: Positive value (or it does nothing for positive numbers)
        System.out.println("Unary plus of a: " + (+a));

        // Unary Minus: Negates the value
        System.out.println("Unary minus of a: " + (-a));

        // Increment Operator (Pre-increment)
        System.out.println("Pre-increment of a: " + (++a));

        // Decrement Operator (Pre-decrement)
        System.out.println("Pre-decrement of a: " + (--a));

        // Post-increment
        System.out.println("Post-increment of a: " + (a++));
        System.out.println("Value of a after post-increment: " + a);

        // Post-decrement
        System.out.println("Post-decrement of a: " + (a--));
        System.out.println("Value of a after post-decrement: " + a);

        // Logical complement: Negates a boolean value
        System.out.println("Logical complement of flag: " + (!flag));
    }
}