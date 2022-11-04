// Write a Java program that shows the usage of try, catch, throws and finally.

/*
 * ALGORITHM
 * 1. Start
 * 2. Declare a variable
 * 3. Read the value of the variable
 * 4. Try to divide the variable by 0
 * 5. Catch the exception
 * 6. Print the exception
 * 7. Finally print the message
 * 8. Stop
 */
import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        int a, b, res;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
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
