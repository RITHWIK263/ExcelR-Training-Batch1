public class Demo9 {
    public class UnaryOperations {

        public static void main(String[] args) {
            // Declare variables
            int number = 10;
            boolean condition = true;

            // Unary Plus (+)
            int positive = +number;
            System.out.println("Unary Plus: " + positive);

            // Unary Minus (-)
            int negative = -number;
            System.out.println("Unary Minus: " + negative);

            // Increment (++)
            System.out.println("Original number: " + number);
            System.out.println("Post-increment: " + (number++)); // Use, then increment
            System.out.println("After Post-increment: " + number);
            System.out.println("Pre-increment: " + (++number)); // Increment, then use

            // Decrement (--)
            System.out.println("Original number: " + number);
            System.out.println("Post-decrement: " + (number--)); // Use, then decrement
            System.out.println("After Post-decrement: " + number);
            System.out.println("Pre-decrement: " + (--number)); // Decrement, then use

            // Logical Complement (!)
            System.out.println("Original condition: " + condition);
            System.out.println("Logical Complement: " + !condition);
        }
    }
}
