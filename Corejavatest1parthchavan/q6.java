package javatraining.Corejavatest1parthchavan;



import java.util.Arrays;
import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] input = new int[size];

 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            input[i] = scanner.nextInt();
        }

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int occurrences = findOccurrences(input, n);

        // Output the result
        System.out.println("Occurrences of the " + n + "th smallest number: " + occurrences);

        // Close the scanner
        scanner.close();
    }

    public static int findOccurrences(int[] input, int n) {
        int occurrences = 0;


      // sorting array
        Arrays.sort(input);

        //  Find the nth smallest number
        int nthSmallest = input[n - 1]; // -1 because arrays are zero-indexed

        // Count occurrences of nthSmallest in the sorted array
        for (int num : input) {
            if (num == nthSmallest) {
                occurrences++;
             }
        }

        return occurrences;
    }
}