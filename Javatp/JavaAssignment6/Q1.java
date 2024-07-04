package JavaAssignment6;


import java.util.Formatter;
import java.util.Scanner;
import java.io.*;

public class Q1 {
    public static void main(String[] args) {
        try {
            // Create a Formatter to write to numbers.txt
            Formatter formatter = new Formatter("numbers.txt");

            // Prompt the user for survey responses
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter survey responses :");
               // enter '-1' to stop
            while (true) {
                // Read the next integer input
                int response = scanner.nextInt();
                
                // If the input is -1, stop reading responses
                if (response == -1) {
                    break;
                }
                
          // Entering the survey into response 
                formatter.format("%d%n", response);
            }

            // closing the formatter and scanner
            formatter.close();
            scanner.close();
            
            System.out.println("Survey responses have been written to numbers.txt.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}