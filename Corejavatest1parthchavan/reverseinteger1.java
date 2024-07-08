package javatraining.Corejavatest1parthchavan
;

import java.util.Scanner;

public class reverseinteger1 {
    


    public static int reverse(int num) {
        int reversed = 0;

        while (num != 0) {
            int dig= num % 10; // Extract the last digit of the number
            num /= 10; // Remove the last digit from the number

            reversed = reversed * 10 + dig;
        }

        return reversed;
    }

    public static void main(String[] args) {
     

      Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number ");
        int number = scanner.nextInt();

        int reversedNumber = reverse(number);
        System.out.println("Reversed Number: " + reversedNumber);

        scanner.close();
    }
}
