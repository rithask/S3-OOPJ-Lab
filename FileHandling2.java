// Write a Java program using reader/writer class that displays
// the number of characters, lines and words in a text file.

import java.io.*;

public class FileHandling2 {
    public static void main(String[] args) {
        try {
            FileReader in = new FileReader("file.txt");
            BufferedReader br = new BufferedReader(in);
            String line;
            int charCount = 0;
            int lineCount = 0;
            int wordCount = 0;
           
            while ((line = br.readLine()) != null) {
                lineCount++;
                charCount += line.length();
                String[] words = line.split(" ");
                wordCount += words.length;
            }
            in.close();

            System.out.println("Characters: " + charCount);
            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e);
        } catch (IOException e) {
            System.out.println("I/O error: " + e);
        }
    }
}
