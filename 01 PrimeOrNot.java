/*
 * PRIME OR NOT
 * 
 * ALGORITHM
 * 
 * 1. Start
 * 2. Declare and initialize the number
 */

public class PrimeOrNot {
    public static void main(String args[]) {
        int num = 12;
        int flag = 0;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("Ther number is a prime number");
        }
        else {
            System.out.println("The number is not a prime number");
        }
    }
}