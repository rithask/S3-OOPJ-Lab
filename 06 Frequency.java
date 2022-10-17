/*
 * Write a Java Program to find the frequency of a given character in a string.
 * 
 * ALGORITHM
 * 1. Start
 * 2. Initialize a string variable, a character variable, and an integer variable
 * 3. Set the integer variable to 0
 * 4. Read the string and the character from the user
 * 5. Convert the string and character to lowercase
 * 6. Get the length of the string
 * 7. Compare the character with each character in the string
 * 8. If they are equal, increment the integer variable
 * 9. Repeat step 8 for all characters in the string
 * 10. Print the integer variable
 * 11. Stop
 */

import java.util.Scanner;

public class Frequency {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        int len = str.length();

        System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        int frequency = 0;
        for (int i = 0; i < len; i++) {
            if (str.charAt(i) == ch) {
                frequency++;
            }
        }
        System.out.println(ch + " occurs " + frequency + " times in \"" + str + "\".");
    }
}