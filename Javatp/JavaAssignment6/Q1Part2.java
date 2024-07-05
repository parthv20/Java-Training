package JavaAssignment6;

import java.util.Scanner;
import java.io.*;

public class Q1Part2 {
    public static void main(String[] args) {
        try {
            // Create a Scanner to read from numbers.txt
            Scanner scanner = new Scanner(new File("numbers.txt"));
            
            // Create a PrintWriter to write to output.txt
            PrintWriter writer = new PrintWriter("output.txt");

            // Read responses from numbers.txt and write to output.txt
            while (scanner.hasNextInt()) {
                int response = scanner.nextInt();
                writer.println(response);
            }

            // Closing the scanner and writer
            scanner.close();
            writer.close();
            
            System.out.println("Survey responses have been read from numbers.txt and written to output.txt.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: File not found.");
            e.printStackTrace();
        }
    }
}