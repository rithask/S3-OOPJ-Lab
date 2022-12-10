// Write a Java program to display the transpose of a given matrix

/*
 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare and initialize the matrix and the transpose matrix
 * 3. Read the order of the matrix
 * 4. Read the elements of the matrix
 * 5. Display the matrix
 * 6. Transpose the matrix
 *      a. For each element in the matrix, swap the row and column indices
 *      b. Store the element in the transpose matrix
 *      c. Repeat for all elements
 * 7. Display the transpose matrix
 * 8. Stop
 */

import java.util.Scanner;

public class TransposeOfAMatrix {
    public static void main(String args[]) {
        int r, c;
        int a[][] = new int[10][10];
        int trans[][] = new int[10][10];

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the order of matrix: ");
        r = sc.nextInt();
        c = sc.nextInt();

        System.out.print("Enter the elements of matrix: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println();
        System.out.println("The matrix is: ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
                trans[j][i] = a[i][j];
            }
            System.out.println();
        }

        System.out.println("The transpose of matrix is: ");
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                System.out.print(trans[i][j] + " ");
            }
            System.out.println();
        }
    }
}
