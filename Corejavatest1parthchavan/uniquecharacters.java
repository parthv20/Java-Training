package javatraining.Corejavatest1parthchavan;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class uniquecharacters {
 
    

        public static void main(String[] args) {
            // File paths
            String inputFilePath = System.getProperty("java.home") + "/input.txt";
            String outputFilePath = System.getProperty("java.home") + "/output.txt";
    
            Set<Character> uniqueChars = new HashSet<>();
    
            // Read from input file using Scanner
            try (Scanner scanner = new Scanner(new File(inputFilePath))) {
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    for (char c : line.toCharArray()) {
                        if (Character.isLetter(c)) { // just to consider only letters as characters
                            uniqueChars.add(c);
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error reading input file: " + e.getMessage());
            }
    
            // Write unique characters to output file using PrintWriter
            try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
                for (char c : uniqueChars) {
                    writer.println(c);
                }
            } catch (IOException e) {
                System.err.println("Error writing to output file: " + e.getMessage());
            }
        }
    }