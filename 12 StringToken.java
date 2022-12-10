/*
 * Write a Java program that reads a line of integers, and then displays each
 * integer, and the sum of all the integers (Use String Tokenizer class of java.util).

 * ALGORITHM
 * 
 * 1. Start
 * 2. Initialize a string variable
 * 3. Read the string from the user
 * 4. Create a StringTokenizer object
 * 5. Initialize a sum variable to 0
 * 6. While there are more tokens
 * 7. Convert the token to an integer
 * 8. Print the integer
 * 9. If there are more tokens, print " + "
 * 10. Add the integer to the sum
 * 11. Print " = " and the sum
 * 12. Stop
 */

import java.util.Scanner;
import java.util.StringTokenizer;

public class StringToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line of integers: ");
        String line = sc.nextLine();

        StringTokenizer st = new StringTokenizer(line);
        int sum = 0;
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            System.out.print(num);
            if (st.hasMoreTokens()) {
                System.out.print(" + ");
            }
            sum += num;
        }
        System.out.println(" = " + sum);
    }
}
