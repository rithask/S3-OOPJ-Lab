/* Write a Java program that shows the usage of try, catch, throws and finally.

 * ALGORITHM
 * 1. Start
 * 2. Declare two variables a and b
 * 3. Read the values of a and b
 * 4. Try to divide a by b
 * 5. If an exception is thrown, catch it and print the message
 * 6. Finally, print a message
 * 7. Stop
 */
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b, res;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();

        try {
            res = a / b;
            System.out.println(a + "/" + b + " = " + res);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Finally block is always executed");
        }
    }
}
