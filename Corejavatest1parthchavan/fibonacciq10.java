package javatraining.Corejavatest1parthchavan;

  

import java.util.Scanner;
public class fibonacciq10 {
    

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int fibPrev = 0;
        int fibCurrent = 1;
        int fibNext = 0;

        for (int i = 2; i <= n; i++) {
            fibNext = fibPrev + fibCurrent;
            fibPrev = fibCurrent;
            fibCurrent = fibNext;
        }

        return fibNext;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    
        System.out.print("Enter the position (n) to find the nth Fibonacci number: ");
        int n = scanner.nextInt();
        int fib = fibonacci(n);

        
        System.out.println("The " + n + "th Fibonacci number is: " + fib);

    
        scanner.close();
    }
}