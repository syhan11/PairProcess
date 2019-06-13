/*
 * Start with the code below and create a program that will output
 * the sum, product, and average of num1 and num2.
 *
 * If the calculated sum is over 200, print an asterisk next to the sum.
 * Bonus: If the calculated sum is under 1000,
 *        it should have a tilde (~) printed next to it.
 */

import java.util.Scanner;

public class PairProcess {

    public static void main(String[] args) {
        int num1, num2;
        int sum = 0, prod = 0;
        double avg = 0;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        sum = num1 + num2;
        prod = num1 * num2;
        avg = sum / 2.0;

        System.out.printf("Sum of %d and %d is %,d", num1, num2, sum);
        if (sum > 200) {
            System.out.printf("*");
            if (sum < 1000)
                System.out.printf("~");
        }

        System.out.printf ("\n");

        System.out.printf("Product of %d and %d is %,d\n", num1, num2, prod);
        System.out.printf("Average of %d and %d is %,.1f\n", num1, num2, avg);


    }

}