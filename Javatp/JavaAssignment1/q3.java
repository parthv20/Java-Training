package JavaAssignment1;

import java.util.Scanner;

public class q3 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       // Initialize counters
       int negativeCount = 0;
       int positiveCount = 0;
       int zeroCount = 0;

       // Prompt user to enter five numbers
       System.out.println("Enter five numbers:");

       // Read each number and classify
       for (int i = 0; i < 5; i++) {
           int number = scanner.nextInt();

           if (number < 0) {
               negativeCount++;
           } else if (number > 0) {
               positiveCount++;
           } else {
               zeroCount++;
           }
       }

       // Print the results
       System.out.println("Number of negative numbers: " + negativeCount);
       System.out.println("Number of positive numbers: " + positiveCount);
       System.out.println("Number of zeros: " + zeroCount);

       scanner.close();
   }
}