public class Test {

    // Addition
    static void add(int a, int b) {
        int res = a + b;
        System.out.println("Addition op: " + res);
    }

    // Subtraction
    static void sub(int a, int b) {
        int res = a - b;
        System.out.println("Subtraction op: " + res);
    }

    // Multiplication
    static void mul(int a, int b) {
        int res = a * b;
        System.out.println("Multiplication op: " + res);
    }

    // Division
    static void div(int a, int b) {
        if (b != 0) {
            double res = (double) a / b;
            System.out.println("Division op: " + res);
        } else {
            System.out.println("Error: Division by zero is not allowed.");
        }
    }

    // Main method
    public static void main(String[] args) {
        int x = 2;
        int y = 2;

        add(x, y);
        sub(x, y);
        mul(x, y);
        div(x, y);
    }
}

