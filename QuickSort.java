/*
 * Write a Java program that implements Quick sort
 * algorithm for sorting a list of names in ascending order.

 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare an array of names
 * 3. Read the number of names
 * 4. Read the names
 * 5. Call the quickSort() method
 * 6. Display the sorted names
 * 7. Stop
 * 
 * Algorithm for quickSort
 * 1. Start
 * 2. If left < right
 * 3.     Set pivot = partition()
 * 4.     Call quickSort() for left subarray
 * 5.     Call quickSort() for right subarray
 * 6. Stop
 * 
 * Algorithm for partition
 * 1. Start
 * 2. Set pivot = names[right]
 * 3. Set i = left - 1
 * 4. For j = left to right - 1
 * 5.     If names[j] < pivot
 * 6.         i++
 * 7.         Swap names[i] and names[j]
 * 8. Swap names[i + 1] and names[right]
 * 9. Return i + 1
 * 10. Stop
 */

import java.util.Scanner;

public class QuickSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];
        System.out.println("Enter the names: ");
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
        }
        quickSort(names, 0, n - 1);
        System.out.println("The sorted names are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i]);
        }
    }

    public static void quickSort(String[] names, int left, int right) {
        if (left < right) {
            int pivot = partition(names, left, right);
            quickSort(names, left, pivot - 1);
            quickSort(names, pivot + 1, right);
        }
    }

    public static int partition(String[] names, int left, int right) {
        String pivot = names[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (names[j].compareTo(pivot) < 0) {
                i++;
                String temp = names[i];
                names[i] = names[j];
                names[j] = temp;
            }
        }
        String temp = names[i + 1];
        names[i + 1] = names[right];
        names[right] = temp;
        return i + 1;
    }
}
