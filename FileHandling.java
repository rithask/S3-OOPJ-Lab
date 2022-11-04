// Write a Java program that reads from a file and writes to a file by handling all file related exceptions. (Using FileInputStream and FileOutputStream classes)

import java.io.*;

public class FileHandling {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("file.txt");
            FileOutputStream out = new FileOutputStream("file2.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
