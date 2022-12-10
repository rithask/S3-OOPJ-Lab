/* Write a Java program that reads from a file and writes
 * to a file by handling all file related exceptions.
 * (Using FileInputStream and FileOutputStream classes)

 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare a FileInputStream object
 * 3. Declare a FileOutputStream object
 * 4. Repeat until the end of the file
 *    4.1 Read a character from the input file
 *    4.2 Write the character to the output file
 * 5. Close the input and output files
 * 6. Stop
 */

import java.io.*;

public class FileHandling1 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("input.txt");
            FileOutputStream fos = new FileOutputStream("output.txt");
            int i;
            while ((i = fis.read()) != -1) {
                fos.write((char) i);
            }
            fis.close();
            fos.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
        catch (IOException e) {
            System.out.println("An I/O error occured");
        }
    }
}
