/*
 * Write a Java program that checks whether a given string is a palindrome or not.
 * 
 * ALGORITHM
 * 1. Start
 * 2. Initialize a string variable
 * 3. Initialise a boolean variable to true
 * 4. Read the string from the user
 * 5. Convert the string to lowercase
 * 6. Get the length of the string
 * 7. Compare the first and last characters of the string
 * 8. If they are not equal, set the boolean variable to false
 * 9. Repeat steps 7 and 8 for the second and second last characters, third and third last characters, and so on
 * 10. If the boolean variable is true, print "Palindrome"
 * 11. Else, print "Not a palindrome"
 * 12. Stop
 */
import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]) {
        String str = new String();
        Scanner sc = new Scanner(System.in);
        boolean isPalindrome = true;

        System.out.print("Enter a string: ");
        str = sc.nextLine().toLowerCase();

        int len = str.length();
        for (int i = 0; i < len / 2; i++) {
            if (str.charAt(i) != str.charAt(len - i - 1)) {
                isPalindrome = false;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " IS palindrome.");
        }
        else {
            System.out.println(str + " IS NOT palindrome.");
        }
    }
}