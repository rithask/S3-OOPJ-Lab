/* Write a Java program using reader/writer class that displays the number of
 * characters, lines and words in a text file.

 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare a FileReader object
 * 3. Declare variables to store the number of characters, lines and words
 * 4. Repeat until the end of the file
 *    4.1 Read a character from the file
 *    4.2 If the character is not a space, newline or carriage return, increment the number of characters
 *    4.3 If the character is a space or newline, increment the number of words
 *    4.4 If the character is a newline, increment the number of lines
 * 5. Close the file
 * 6. Print the number of characters, lines and words
 * 7. Stop
 */

import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("input.txt");
            int ch, characters = 0, lines = 0, words = 0;
            while ((ch = fr.read()) != -1) {
                if (ch != ' ' && ch != '\n' && ch != '\r') {
                    characters++;
                }
                // count words in each line
                if (ch == ' ' || ch == '\n') {
                    words++;
                }
                if (ch == '\n') {
                    lines++;
                }
            }
            fr.close();
            System.out.println("Number of characters: " + characters);
            System.out.println("Number of words: " + words);
            System.out.println("Number of lines: " + lines);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
