// public class Test {

//     // Addition
//     static void add(int a, int b) {
//         int res = a + b;
//         System.out.println("Addition op: " + res);
//     }

//     // Subtraction
//     static void sub(int a, int b) {
//         int res = a - b;
//         System.out.println("Subtraction op: " + res);
//     }

//     // Multiplication
//     static void mul(int a, int b) {
//         int res = a * b;
//         System.out.println("Multiplication op: " + res);
//     }

//     // Division
//     static void div(int a, int b) {
//         if (b != 0) {
//             double res = (double) a / b;
//             System.out.println("Division op: " + res);
//         } else {
//             System.out.println("Error: Division by zero is not allowed.");
//         }
//     }

//     // Main method
//     public static void main(String[] args) {
//         int x = 589;
//         int y = 10;

//         add(x, y);
//         sub(x, y);
//         mul(x, y);
//         div(x, y);
//     }
// }
import java.util.Scanner;
import java.util.Arrays;
public class Test {
    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of digits: ");
        int n = sc.nextInt();
        int[] digits = new int[n];
        System.out.println("Enter digits:");
        for (int i = 0; i < n; i++) {
            digits[i] = sc.nextInt();
        }
        int[] result = plusOne(digits);
        System.out.println("Result after plus one:");
        System.out.println(Arrays.toString(result));
    }
}



