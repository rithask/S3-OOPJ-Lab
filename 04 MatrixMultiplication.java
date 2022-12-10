//  Write a Java program to multiply two given matrices

/*
 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare and initialize the matrices
 * 3. Read the order of the matrices
 * 4. If the number of columns of the first matrix is not equal to the number of rows of the second matrix
 *    4.1 print an error message and stop
 * 5. Read the elements of the matrices
 * 6. Multiply the matrices
 *     6.1 For each row in the first matrix  
 *        i. For each column in the second matrix
 *           1. Set the result matrix element to 0
 *           2. For each element in the row of the first matrix
 *              a. Multiply the element of the first matrix with the element of the second matrix
 *              b. Add the result to the result matrix element
 *    6.2 Repeat for all rows
 * 7. Display the result matrix
 * 8. Stop
 */

import java.util.Scanner;

public class MultiplyMatrices {
    public static void main(String[] args) {
        int r1, c1, r2, c2;
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        int c[][] = new int[10][10];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the order of matrix 1: ");
        r1 = sc.nextInt();
        c1 = sc.nextInt();

        System.out.print("Enter the order of matrix 2: ");
        r2 = sc.nextInt();
        c2 = sc.nextInt();

        if (c1 != r2) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }

        System.out.print("Enter the elements of matrix 1: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter the elements of matrix 2: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                c[i][j] = 0;
                for (int k = 0; k < c1; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The product of the matrices is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
